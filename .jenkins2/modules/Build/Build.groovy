// evaluate(new File(".jenkins/modules/Common.groovy"))

// def modules = [:]
// MODULES_LIST.each{
//     modules[it.stage_title] = {
//         stage(it.stage_title){
//             MPLModule("Maven Build",[
//                 module_name: it.module_name
//             ])
//         }
//     }
// }
// parallel (modules)
bat 'echo test'