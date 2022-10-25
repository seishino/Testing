
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
modules_list.each{
    modules[${it}.stage_title] = {
        stage(${it}.stage_title){
            MPLModule("Maven Build",[
                module_name: ${it}.module_name
            ])
        }
    }
}
parallel (modules)