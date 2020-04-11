job('First-Maven-Project-DSL'){
    description("This is the first job created using the DSL jenkins file on ${new Date()}")
    logRotator(int daysToKeep = -1, int numToKeep = -1, int artifactDaysToKeep = -1, int artifactNumToKeep = -1)
    triggers{
        scm('@mintue')
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