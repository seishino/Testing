def modules = [:]
def common = load '../Common.groovy'
common.modules_list.each{
    modules[it.stage_title] = {
        stage(it.stage_title){
            MPLModule("Maven Build",[
                module_name: it.module_name
            ])
        }
    }
}
parallel (modules)