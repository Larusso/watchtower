(defproject
  uochan/watchtower "0.1.4"
  :description "A library for directory watchers forked by liquidz/watchtower"
  :dependencies [[org.clojure/clojure "1.5.0"]]
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories [["private" {:url "s3p://larusso-clojars/releases" :creds :gpg}]])
