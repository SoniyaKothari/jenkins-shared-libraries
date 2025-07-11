def build(String ProjectName, String ImageTag, String DockerHubUser)
{
  sh "docker build -t ${DockerHubUser}/{DockerHubUser}:{DockerHubUser} . "
}
