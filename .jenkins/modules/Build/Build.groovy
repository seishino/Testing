def modules = [:]
modules["sub-module1"] = {
    stage("sub-module1"){
        MPLModule("Maven Build",[
            module_name:"module-1/sub-module1"
        ])
    }
}
modules["sub-module2"] = {
    stage("sub-module2"){
        MPLModule("Maven Build",[
            module_name:"module-1/sub-module2"
        ])
    }
}
modules["module-2"] = {
    stage("module-2"){
        MPLModule("Maven Build",[
            module_name:"module-2"
        ])
    }
}
parallel (modules)
