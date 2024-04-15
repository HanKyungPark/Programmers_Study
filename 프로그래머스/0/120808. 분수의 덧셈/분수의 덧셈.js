function solution(numer1, denom1, numer2, denom2) {
    let denom;
    let numer;
    let sum=0;
    var answer = [];
    denom = denom1 * denom2;
    numer = numer1 * denom2+denom1*numer2;
    for (let i = 1; i <=(Math.min(denom,numer)); i++) {
        if (denom % i == 0 && numer % i ==0) {
            sum=i;
        }
    }
    denom = denom / sum;
    numer = numer / sum;
    var answer = [numer,denom];
    return answer;
}