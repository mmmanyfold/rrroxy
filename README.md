# rrroxy

_generated using Luminus version "2.9.10.86"_

A general proxy test server for local developement

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

and Node.js V5+ for json-server, see below.

## Running

To start the clojure web server, run:

    lein run

To start the node json-server, run:

   npm install json-server -g
   json-server --watch db.json
