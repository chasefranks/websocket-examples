# Websocket Examples

A collections of examples illustrating [WebSockets](https://tools.ietf.org/html/rfc6455) and the [Stomp](https://stomp.github.io/) protocol.

## Usage

To start up the server, run

```
./gradlew basic-websockets:bootRun
```

An example node client is provided which sends messages to the server at "/marco"

```bash
cd basic-websockets/node
npm install
node marco_polo.js
```