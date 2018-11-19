sdp_image_repository = "https://docker-registry.default.svc:5000"
sdp_image_repository_credential = "sdp-jenkins-docker-registry"

application_image_repository = "docker-registry.default.svc:5000/kottoson-images"
application_image_repository_credential = "sdp-jenkins-docker-registry"

libraries{
  github_enterprise
  docker
}

application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
  }
}
