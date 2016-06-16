(require '[cljs.build.api :as cljs])

(def compiler-options {:output-to "compiled.js"
                       :source-map "compiled.js.map"
                       :optimizations :whitespace})

(cljs/build "cljs" compiler-options)
