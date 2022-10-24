def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        node("sub-module1-node"){
            steps{
                    bat 'mvn install -pl module-1/sub-module1 -DskipTests'
            }
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        node("sub-module2-node"){
            steps{
                    bat 'mvn install -pl module-1/sub-module2 -DskipTests'
            }
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        node("module-2-node"){
            steps{
                    bat 'mvn install -pl module-2 -DskipTests'
            }
        }
    }
}
parallel (modules)
