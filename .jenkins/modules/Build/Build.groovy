stage("Build 2"){
    def modules = [:]
    modules["sub-module1"] = {
        stage("sub-module1"){
            echo 'test'
        }
    }
    modules["sub-module2"] = {
        stage("sub-module1"){
            echo 'test'
        }
    }
    parallel (modules)

}
