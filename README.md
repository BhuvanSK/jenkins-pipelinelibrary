### Jenkins Shared Library and Workflows project

Read **[Extending with Shared Libraries](https://jenkins.io/doc/book/pipeline/shared-libraries/)**
  - <https://jenkins.io/doc/book/pipeline/shared-libraries/>


#### Directory  Structure
```
(root)
+- src                     # Groovy source files
|   +- org
|       +- tr
|           +- cpjenkins    
|               +- Pipeline.groovy  # for org.tr.cpjenkins.Pipeline class
+- vars
|   +- build.groovy             # for global variables in jenkins
|   +- test.groovy              
+- resources                    # resource files (external libraries only)
|   +- org
|       +- tr
|           +- cpjenkins
|               +- settings.xml  # resources
```
