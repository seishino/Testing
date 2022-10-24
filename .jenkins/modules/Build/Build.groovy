def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        steps{
            bat 'mvn install -pl module-1/sub-module1 -DskipTests'
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        steps{
            bat 'mvn install -pl module-1/sub-module2 -DskipTests'
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        steps{
            bat 'mvn install -pl module-2 -DskipTests'
        }
    }
}
parallel (modules)
