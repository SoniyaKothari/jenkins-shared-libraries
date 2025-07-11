def push(String ProjectName, String ImageTag, String DockerHubUser)
{
  WithCredentials([usernamePassword(credentialsId:'dockerhub', passwordVariable:'dockerHubPass', usernameVariable:'dockerHubUser')])
  {
    sh "docker login -u {dockerHubUser} -p {dockerHubPass}"
  }
  sh "docker push {(DockerHubUser}/{ProjectName}:{ImageTag}"
}
