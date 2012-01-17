# Rock Paper Scissors

Rock Paper Scissors game in Clojure

## Setup

First clone the project and change directory into it.

    $ git clone https://github.com/pittsburghclj/rock-paper-scissors.git

then install all the dependent libraries using [Leiningen][1]

    $ lein deps


## Usage

In Emacs adjust the Inferior Lisp Program to `./script/repl` via

    M-x set-variable

and
    
    Set variable: inferior-lisp-program

Then run from file in root of project (e.g. this README.markdown)

    M-x inferior-lisp


## License

Copyright (c) Relevance, Inc. All rights reserved.  

The use and distribution terms for this software are  
covered by the Eclipse Public License 1.0 which can be   
found in the file epl-v10.html at the root of this distribution.  
By using this software in any fashion, you are agreeing  
to be bound by the terms of this license.

[1]: https://github.com/technomancy/leiningen
