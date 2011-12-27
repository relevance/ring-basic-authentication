{:namespaces
 ({:source-url
   "http://github.com/remvee/ring-basic-authentication/blob/837fb7039a372945d03fbaf1c2a4b39ec078540d/src/remvee/ring/middleware/basic_authentication.clj",
   :wiki-url "remvee.ring.middleware.basic-authentication-api.html",
   :name "remvee.ring.middleware.basic-authentication",
   :author "Remco van 't Veer",
   :doc "HTTP basis authentication middleware for ring."}),
 :vars
 ({:arglists
   ([app authenticate]
    [app authenticate realm]
    [app authenticate realm denied-response]),
   :name "wrap-basic-authentication",
   :namespace "remvee.ring.middleware.basic-authentication",
   :source-url
   "http://github.com/remvee/ring-basic-authentication/blob/837fb7039a372945d03fbaf1c2a4b39ec078540d/src/remvee/ring/middleware/basic_authentication.clj#L15",
   :raw-source-url
   "http://github.com/remvee/ring-basic-authentication/raw/837fb7039a372945d03fbaf1c2a4b39ec078540d/src/remvee/ring/middleware/basic_authentication.clj",
   :wiki-url
   "/remvee.ring.middleware.basic-authentication-api.html#remvee.ring.middleware.basic-authentication/wrap-basic-authentication",
   :doc
   "Wrap response with a basic authentication challenge as described in\nRFC2617 section 2.\n\nThe authenticate function is called with two parameters, the userid\nand password, and should return a value when the login is valid.  This\nvalue is added to the request structure with the :basic-authentication\nkey.\n\nThe realm is a descriptive string visible to the visitor.  It,\ntogether with the canonical root URL, defines the protected resource\non the server.\n\nThe denied-response is a ring response structure which will be\nreturned when authorization fails.  The appropriate status and\nauthentication headers will be merged into it.  It defaults to plain\ntext 'access denied' response.",
   :var-type "function",
   :line 15,
   :file
   "/home/remco/Development/clojure/ring-basic-authentication/src/remvee/ring/middleware/basic_authentication.clj"})}
