import Common

def modules = [:]
Common.MODULES_LIST.each{
    modules[it.stage_title] = {
        stage(it.stage_title){
            MPLModule("Maven Build",[
                module_name: it.module_name
            ])
        }
    }
}
parallel (modules)