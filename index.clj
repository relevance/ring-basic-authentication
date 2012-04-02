{:namespaces
 ({:source-url
   "http://github.com/remvee/ring-basic-authentication/blob/9bf8ccb34902b9aedc6ff28f413c4a3a20c12c22/src/ring/middleware/basic_authentication.clj",
   :wiki-url "ring.middleware.basic-authentication-api.html",
   :name "ring.middleware.basic-authentication",
   :author "Remco van 't Veer",
   :doc "HTTP basis authentication middleware for ring."}),
 :vars
 ({:arglists
   ([app authenticate]
    [app authenticate realm]
    [app authenticate realm denied-response]),
   :name "wrap-basic-authentication",
   :namespace "ring.middleware.basic-authentication",
   :source-url
   "http://github.com/remvee/ring-basic-authentication/blob/9bf8ccb34902b9aedc6ff28f413c4a3a20c12c22/src/ring/middleware/basic_authentication.clj#L30",
   :raw-source-url
   "http://github.com/remvee/ring-basic-authentication/raw/9bf8ccb34902b9aedc6ff28f413c4a3a20c12c22/src/ring/middleware/basic_authentication.clj",
   :wiki-url
   "/ring.middleware.basic-authentication-api.html#ring.middleware.basic-authentication/wrap-basic-authentication",
   :doc
   "Wrap response with a basic authentication challenge as described in\nRFC2617 section 2.\n\nThe authenticate function is called with two parameters, the userid\nand password, and should return a value when the login is valid.  This\nvalue is added to the request structure with the :basic-authentication\nkey.\n\nThe realm is a descriptive string visible to the visitor.  It,\ntogether with the canonical root URL, defines the protected resource\non the server.\n\nThe denied-response is a ring response structure which will be\nreturned when authorization fails.  The appropriate status and\nauthentication headers will be merged into it.  It defaults to plain\ntext 'access denied' response.",
   :var-type "function",
   :line 30,
   :file "src/ring/middleware/basic_authentication.clj"})}
