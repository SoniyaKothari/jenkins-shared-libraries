def call(String ProjectName, String ImageTag, String DockerHubUser) 
{
    def imageFullName = "${DockerHubUser}/${ProjectName}:${ImageTag}"
    echo "Building Docker image: ${imageFullName}"

    withEnv(["DOCKER_HOST=unix:///var/run/docker.sock"]) 
    {
        sh "docker build -t ${imageFullName} ."
    }
}
