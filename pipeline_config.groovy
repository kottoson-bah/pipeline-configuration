libraries{
  github_enterprise
  docker{
    registry = "docker-registry.default.svc:5000/keegan-sdp"
    cred = "docker-registry"
  }
}

keywords{
 merge = true 
}
