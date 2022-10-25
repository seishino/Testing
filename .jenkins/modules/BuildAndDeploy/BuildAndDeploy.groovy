MPLModule('Common')
def tasks = [:]
module_list.each{
    tasks[it.stage_title] = {
        stage(it.stage_title){
            bat "echo 'build ${it.module_name} module'"
        }
    }
}
parallel (tasks)