def call(String ProjectName, String ImageTag, String DockerHubUser)
{
  sh "docker -t ${DockerHubUser}/{ProjectName}:{ImageTag} . "
} 
