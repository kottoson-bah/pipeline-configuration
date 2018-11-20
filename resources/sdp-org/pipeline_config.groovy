sdp_image_repository = "https://docker-registry.default.svc:5000"
sdp_image_repository_credential = "sdp-jenkins-docker-registry"

application_image_repository = "docker-registry.default.svc:5000/kottoson-images"
application_image_repository_credential = "sdp-jenkins-docker-registry"

libraries{
  github_enterprise
  docker
  sonarqube
  openshift{
    url = "https://master.ocp-dev.microcaas.net:8443"
    tiller_namespace = "kottoson-tiller"
    tiller_credential = "kottoson-tiller"
    helm_configuration_repository = "https://github.com/kottoson-bah/sdp-example-helm-config.git"
    helm_configuration_repository_credential = "github"
  }
}

application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
  }
}
