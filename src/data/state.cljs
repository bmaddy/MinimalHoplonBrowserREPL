(ns data.state
  (:require [javelin.core :refer [cell] :refer-macros [cell= defc defc=]]))

(defc important-message "an important message")
