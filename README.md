* Run `lein uberjar` to build the plugin jar
* Dealing with leiningen dependencies is a challenge due to Trapperkeeper's minimal plugin support
  * Hence the odd-looking project.clj file
  * Need to exclude from the uberjar ALL dependencies that will be available at runtime
    * This means any dependencies that Trapperkeeper will provide
    * AND any dependencies that other plugin jars will have
  * In other words, there can't be any duplicates found on the classpath at runtime
* Last known Trapperkeeper version this works with: `0.2.x`
* The plugin itself is using an older version of the PuppetDB API and may need to be updated
