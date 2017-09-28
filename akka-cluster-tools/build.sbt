import akka.{ AkkaBuild, Dependencies, Formatting, MultiNode, ScaladocNoVerificationOfDiagrams, OSGi }

AkkaBuild.defaultSettings
Formatting.formatSettings
OSGi.clusterTools
Dependencies.clusterTools

enablePlugins(akka.Unidoc, MultiNode, ScaladocNoVerificationOfDiagrams)
