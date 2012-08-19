(defproject labrepl "0.0.2-SNAPSHOT"
  :description "Clojure exercises, with integrated repl and webapp"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.4"]
                 [org.clojure/data.json "0.1.3"]
                 [ring/ring-jetty-adapter "1.1.2" :exclusions [org.clojure/clojure
                                                                   org.clojure/clojure-contrib]]
                 [compojure "1.1.1" :exclusions [org.clojure/clojure]]
                 [hiccup "1.0.1" :exclusions [org.clojure/clojure]]
                 [log4j "1.2.17" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 [jline "2.7"]]
  :main labrepl)
