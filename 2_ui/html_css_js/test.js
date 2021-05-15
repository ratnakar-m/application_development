function m1(){
	alert(new Date());
}

function addDiv(){
	div = document.createElement('div');
	div.textContent='I am newly added div';
	
	document.body.append(div);
}

function callServer(){
	/*
	XMLHttpRequest/ajax call to make a request to the server 
	*/
}