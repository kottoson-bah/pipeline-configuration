libraries{
  github
  docker{
    registry = "docker-registry.default.svc:5000"
    cred = "openshift-docker-registry"
    repo_path_prefix = "keegan-test-images"
  }
  sdp{
    images{
      registry = "docker-registry.default.svc:5000"
      repo = "keegan-sdp"
      cred = "openshift-docker-registry"
    }
  }
  openshift{
    openshift_url = "https://master.ocp-dev.microcaas.net:8443"
    helm_configuration_repository = "https://github.com/kottoson-bah/sdp-example-helm-config.git"
    helm_configuration_repository_credential = "github"
    tiller_namespace = "keegan-test-tiller"
    tiller_credential = "keegan-test-tiller"
  }
}

application_environments {
  dev {
    short_name: "dev"
    long_name: "Development"
    //promote_previous_image: false
  }
}

keywords{
 merge = true 
 develop = /^[dD]evelop$/
 master = /^[mM]aster$/
}
