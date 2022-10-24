def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        node("sub-module1-node"){
            steps{
                    bat 'echo test'
            }
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        node("sub-module2-node"){
            steps{
                    bat 'echo test'
            }
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        node("module-2-node"){
            steps{
                    bat 'echo test'
            }
        }
    }
}
parallel (modules)
