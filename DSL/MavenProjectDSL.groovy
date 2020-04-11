job('First-Maven-Project-DSL1'){
    description("This is the first job created using the DSL jenkins file on ${new Date()}")
    scm{
        git("https://github.com/sumanthvm/Jenkins_Upgradev3.git", 'master')
    }
    triggers{
       scm('* * * * *')
    }
    steps{
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}


