github.clj
==========

An experiment to try to Clojure-ify the [GitHub Java][1] lib.

Usage
=====

I don't have any real usage yet, but when I do, I'll show something.  Right
now, just feel free to look into the `github.core`, `github.url`, and other
`github.*` namespaces.

Why?
====
I'm learning Clojure, so I thought I'd make a library that would be more
Clojure-like than the Java lib.  I don't have any real goal with this lib
(sorry), but if I get comfortable enough to work with it, I might just
reimplement it in Clojure instead of proxying through the Java library for
calls that really could just HTTP POST, GET, etc., using RESTful semantics.

License
=======

Copyright (C) 2011 Nick Klauer (klauer@gmail.com)

Distributed under the Eclipse Public License, the same as Clojure.

[1]: https://github.com/eclipse/egit-github
