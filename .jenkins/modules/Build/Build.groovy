def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        node("sub-module1-node"){
            steps{
                    MPLModule('Maven Build', CFG)
            }
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        node("sub-module2-node"){
            steps{
                    MPLModule('Maven Build', CFG)
            }
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        node("module-2-node"){
            steps{
                    MPLModule('Maven Build', CFG)
            }
        }
    }
}
parallel modules
