def module_list = [
        [
            stage_title: "sub-module1",
            module_name: "module-1/sub-module1"
        ],
        [
            stage_title: "sub-module2",
            module_name: "module-1/sub-module1"
        ],
        [
            stage_title: "module-2",
            module_name: "module-2"
        ]
    ]

def tasks = [:]
module_list.each{
    tasks[it.stage_title] = {
        stage(it.stage_title){
            bat "echo 'build ${it.module_name} module'"
        }
    }
}
parallel (tasks)