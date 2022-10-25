
def modules = [:]
def modules_list = [
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
for (i in modules_list){
    modules[modules_list.stage_title] = {
        stage(modules_list.stage_title){
            MPLModule("Maven Build",[
                module_name: modules_list.module_name
            ])
        }
    }
}
parallel (modules)