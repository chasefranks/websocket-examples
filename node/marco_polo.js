var W3CWebSocket = require('websocket').w3cwebsocket;

var url = 'ws://localhost:8080/marco';

var socket = new W3CWebSocket(url);

socket.onopen = function() {
	console.log("opening websocket");
	sayMarco();
}

socket.onclose = function() {
	console.log("closing websocket");
}

socket.onmessage = function(e) {
	console.log("message received");
	console.log(e.data);
	setTimeout(function() {sayMarco()}, 2000);
}

function sayMarco() {
	console.log("sending message");
	socket.send("Marco");
}
