def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        node("sub-module1-node"){
            steps{
                    MPLModule('Maven Build', [
                        maven.module_name: "sub-module1"
                    ])
            }
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module1"){
        node("sub-module2-node"){
            steps{
                    MPLModule('Maven Build', [
                        maven.module_name: "sub-module2"
                    ])
            }
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        node("module-2-node"){
            steps{
                    MPLModule('Maven Build', [
                        maven.module_name: "module-2"
                    ])
            }
        }
    }
}
parallel modules
