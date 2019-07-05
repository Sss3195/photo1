<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script>
    function point(x,y){
	    	var oDiv=document.createElement('div');
	    	oDiv.style.position='absolute';
	    	oDiv.style.height='4px';
	    	oDiv.style.width='4px';
	    	oDiv.style.backgroundColor='blue';
	    	oDiv.style.left=x+'px';
	    	oDiv.style.top=y+'px';
	    	//document.body.appendChild(oDiv);
	    	return oDiv;
	    }
	    
	//划线
	    function drawLine(x1,y1,x2,y2){
	    	var x=x2-x1;
	    	var y=y2-y1;
	    	var frag=document.createDocumentFragment();
	    	if(Math.abs(y)>Math.abs(x)){
	    		if(y>0){
	    			for(var i=0;i<y;i++){
	    				frag.appendChild(point(x1,i+y1));
	    			}
	    		}else{
	    			for(var i=0;i>y;i--){
	    				frag.appendChild(point(x1,i+y1));
		    		}
	    		}
	    	}else{
	    		if(x>0){
	    			for(var i=0;i<x;i++){
	    				frag.appendChild(point(i+x1,y1));
	    			}
	    		}else{
	    			for(var i=0;i>x;i--){
	    				frag.appendChild(point(i+x1,y1));
	    			}
	    		}
	    	}
	    	document.getElementById('div1').appendChild(frag);
	    }
	    drawLine(100,100,1000,1000)
	</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="submit" valut="提交"id="div1" onclick="drawLine(100,100,1000,1000);">

</body>
</html>