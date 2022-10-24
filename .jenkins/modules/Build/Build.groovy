def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        node("sub-module1-node"){
            steps{
                    echo 'test'
            }
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        node("sub-module2-node"){
            steps{
                    echo 'test'
            }
        }
    }
}
parallel (modules)
