libraries{
  github_enterprise
  docker{
    registry = "docker-registry.default.svc:5000"
    cred = "openshift-docker-registry"
    repo_path_prefix = "keegan-sdp"
  }
  sonarqube
  sdp{
    images{
      registry = "https://docker-registry.default.svc:5000"
      repo = "keegan-sdp"
      cred = "openshift-docker-registry"
    }
  }
}

keywords{
 merge = true 
}
