function solution(n) {
    let pizza =6;
    while(true){
        if((pizza % n === 0) && (pizza % 6 === 0)){
        break;    
        }
        pizza++;
        
    }
    return (pizza/6);
}