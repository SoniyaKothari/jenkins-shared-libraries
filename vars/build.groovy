def call(String ProjectName, String ImageTag, String DockerHubUser)
{
  sh "docker build -H unix:///var/run/docker.sock -t ${DockerHubUser}/{ProjectName}:{ImageTag} . "
}
