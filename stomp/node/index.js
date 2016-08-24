var Stomp = require('stompjs');

var url = 'ws://localhost:8080/marcopolo';

var client = Stomp.overWS(url);

var payload = JSON.stringify({'message': 'Marco!'});

client.connect('guest', 'guest',
	function(frame) {
		console.log("connected to websocket, sending stomp message");
		client.send("/app/marco", {}, payload);
	}
);