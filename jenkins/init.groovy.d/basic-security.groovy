#!groovy
import jenkins.model.*
import hudson.security.*

Jenkins.instance.setSecurityRealm(new HudsonPrivateSecurityRealm(false))
Jenkins.instance.setAuthorizationStrategy(new FullControlOnceLoggedInAuthorizationStrategy())
Jenkins.instance.save()