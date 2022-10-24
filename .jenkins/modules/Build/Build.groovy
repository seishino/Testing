def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        steps{
                MPLModule('Maven Build', CFG)
        }
    }
}
modules["sub-module2"] = {
     stage("sub-module2"){
        steps{
                MPLModule('Maven Build', CFG)
        }
    }
}
modules["module-2"]= {
    stage("module-2"){
        steps{
                MPLModule('Maven Build', CFG)
        }
    }
}
parallel modules
