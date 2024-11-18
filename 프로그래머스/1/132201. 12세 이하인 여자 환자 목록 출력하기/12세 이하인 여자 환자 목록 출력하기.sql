select PT_NAME,PT_NO,GEND_CD,AGE, ifnull(TLNO,'NONE') as TLNO
from PATIENT where age <=12 and GEND_CD like'%W%' order by AGE desc, PT_NAME;