libraries{
  github_enterprise
  docker{
    registry = "docker-registry.default.svc:5000/keegan-sdp"
    cred = "openshift-docker-registry"
  }
  sonarqube
  sdp{
    images{
      registry = "https://docker-registry.default.svc:5000
      repo = "keegan-sdp"
      cred = "openshift-docker-registry"
  }
}

keywords{
 merge = true 
}
