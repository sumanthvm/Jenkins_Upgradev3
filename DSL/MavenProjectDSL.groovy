job('First-Maven-Project-DSL'){
    description("This is the first job created using the DSL jenkins file on ${new Date()}")

    triggers{
        scm('* * * * *')
    }
    scm{
        github("https://github.com/sumanthvm/Jenkins_Upgradev3.git", master)
    }
    steps{
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}