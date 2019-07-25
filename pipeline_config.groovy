libraries{
  github{
    source_type = 'github'
  }
  docker{
    registry = "docker-registry.default.svc:5000"
    cred = "openshift-docker-registry"
    repo_path_prefix = "keegan-test-images"
  }
  sdp{
    images{
      registry = "http://docker-registry.default.svc:5000"
      repository = "keegan-sdp"
      cred = "openshift-docker-registry"
    }
  }
  openshift{
    url = "https://master.ocp-dev.microcaas.net:8443"
    helm_configuration_repository = "https://github.com/kottoson-bah/sdp-example-helm-config.git"
    helm_configuration_repository_credential = "github"
    tiller_namespace = "keegan-test-tiller"
    tiller_credential = "keegan-test-tiller"
    //promote_previous_image = false
  }
  owasp_zap{
    target = "http://sdp-example-proj-dev.apps.ocp-dev.microcaas.net"
  }
}

application_environments {
  dev {
    short_name = "dev"
    long_name = "Development"
  }
}

keywords{
 merge = true 
 develop = /^[dD]evelop$/
 master = /^[mM]aster$/
}
