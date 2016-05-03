package org.wso2.developerstudio.eclipse.artifact.template.integration.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.wso2.developerstudio.eclipse.artifact.template.integration.Activator;
import org.wso2.developerstudio.eclipse.artifact.template.wizards.TemplateProjectCreationWizard;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;


public class IntegrationTemplateProjectCreationWizard extends TemplateProjectCreationWizard {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private String version ="1.0.0";

//	private TemplateProjectCreationWizard templateWizard = null;
	
	public IntegrationTemplateProjectCreationWizard() {
		super();
//		templateWizard = new TemplateProjectCreationWizard();
	}

	public boolean performFinish() {
		return super.performFinish();
//		try {
//			project = templateModel.getTemplateSaveLocation().getProject();
//			createSequenceArtifact(templateModel);
//			if(fileLst.size()>0){
//				openEditor(fileLst.get(0));
//			}
//		} catch (Exception e) {
//			log.error("An unexpected error has occurred", e);
//		}
//		return true;
	}
	
//	private boolean createSequenceArtifact(TemplateModel sequenceModel) throws Exception {
		
//        boolean isNewArtifact =true;
//        IContainer location = project.getFolder("src" + File.separator + "main"
//				+ File.separator + "synapse-config" + File.separator
//				+ "templates");
//		esbProjectArtifact = new ESBProjectArtifact();
//		esbProjectArtifact.fromFile(project.getFile("artifact.xml").getLocation().toFile());	
//		File pomfile = project.getFile("pom.xml").getLocation().toFile();
//		getModel().getMavenInfo().setPackageName("synapse/template");
//		if (!pomfile.exists()) {
//			createPOM(pomfile);
//		}
//
//		updatePom();
//		project.refreshLocal(IResource.DEPTH_INFINITE,
//				new NullProgressMonitor());
//		String groupId = getMavenGroupId(pomfile);
//		groupId += ".template";
//
//		if (getModel().getSelectedOption().equals("import.template")) {
//			IFile sequence = location.getFile(new Path(getModel().getImportFile().getName()));
//			if(sequence.exists()){
//				if(!MessageDialog.openQuestion(getShell(), "WARNING", "Do you like to override exsiting project in the workspace")){
//					return false;	
//				}
//				isNewArtifact = false;
//			} 	
//			copyImportFile(location,isNewArtifact,groupId);
//		} else {
//			String templateContent ="";
//			String template = "";
//			ArtifactTemplate selectedTemplate = templateModel.getSelectedTemplate();
//			templateContent = FileUtils.getContentAsString(selectedTemplate.getTemplateDataStream());
//			
//			if (selectedTemplate.getName().equals("Address Endpoint Template")) {
//				template = createEPTemplate(templateContent,"Address Endpoint Template");
//			} else if (selectedTemplate.getName().equals("WSDL Endpoint Template")) {
//				template = createEPTemplate(templateContent,"WSDL Endpoint Template");
//			} else if (selectedTemplate.getName().equals("Default Endpoint Template")) {
//				template = createEPTemplate(templateContent,"Default Endpoint Template");
//			}else if (selectedTemplate.getName().equals("Sequence Template")) {
//				template = createEPTemplate(templateContent,"Sequence Template");
//			}else if (selectedTemplate.getName().equals("HTTP Endpoint Template")){
//				template = createEPTemplate(templateContent,"HTTP Endpoint Template");
//			}else {
//				template = createEPTemplate(templateContent, "");
//			}
//
//			File destFile = new File(location.getLocation().toFile(),
//					sequenceModel.getTemplateName() + ".xml");
//			FileUtils.createFile(destFile, template);
//			fileLst.add(destFile);
//			ESBArtifact artifact = new ESBArtifact();
//			artifact.setName(sequenceModel.getTemplateName());
//			artifact.setVersion(version);
//			if("Sequence Template".equals(selectedTemplate.getName())){
//				artifact.setType("synapse/sequenceTemplate");
//			}else{
//				artifact.setType("synapse/endpointTemplate");
//			}			
//			artifact.setServerRole("EnterpriseServiceBus");
//			artifact.setGroupId(groupId);
//			artifact.setFile(FileUtils.getRelativePath(project.getLocation()
//					.toFile(), new File(location.getLocation().toFile(),
//					sequenceModel.getTemplateName() + ".xml")).replaceAll(Pattern.quote(File.separator), "/"));
//			esbProjectArtifact.addESBArtifact(artifact);
//		}
//		esbProjectArtifact.toFile();
//		project.refreshLocal(IResource.DEPTH_INFINITE,
//				new NullProgressMonitor());
//		return true;
//	}
	
	public String createEPTemplate(String templateContent, String type) throws IOException{
		return super.createEPTemplate(templateContent, type);
//		String newContent="";
//		if(type.equals("Sequence Template")){
//			newContent=MessageFormat.format(templateContent,templateModel.getTemplateName());
//		}else{
//			templateContent = templateContent.replaceAll("\\{", "<");
//			templateContent = templateContent.replaceAll("\\}", ">");
//			newContent = StringUtils.replace(templateContent,"<ep.name>", templateModel.getTemplateName());
//			if(type.equals("Address Endpoint Template")){
//				newContent = StringUtils.replace(newContent,"<address.uri>", templateModel.getAddressEPURI());
//			}else if(type.equals("WSDL Endpoint Template")){
//				newContent = StringUtils.replace(newContent,"<wsdl.uri>", templateModel.getWsdlEPURI());
//				newContent = StringUtils.replace(newContent,"<service.name>", templateModel.getWsdlEPService());
//				newContent = StringUtils.replace(newContent,"<service.port>", templateModel.getWsdlEPPort());
//			}else if (type.equals("HTTP Endpoint Template")) {
//				newContent = StringUtils.replace(newContent,"<http.uritemplate>", templateModel.getHttpUriTemplate());				
//				if(!HttpMethodType.Leave_as_is.name().equals(templateModel.getHttpMethod().name())){
//				    newContent = StringUtils.replace(newContent,"<http.method>", templateModel.getHttpMethod().name().toLowerCase());
//				} else{
//					newContent = StringUtils.replace(newContent,"<http.method>", "");
//				}
//				
//			}
//		}
//        return newContent;
	}

//	public void updatePom() throws IOException, XmlPullParserException {
//		templateWizard.updatePom();
////		File mavenProjectPomLocation = project.getFile("pom.xml").getLocation().toFile();
//		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
//		version = mavenProject.getVersion();
//
//		// Skip changing the pom file if group ID and artifact ID are matched
//		if (MavenUtils.checkOldPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-template-plugin")) {
//			return;
//		}
//
//		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-template-plugin",
//				ESBMavenConstants.WSO2_ESB_TEMPLATE_VERSION, true);
//		PluginExecution pluginExecution = new PluginExecution();
//		pluginExecution.addGoal("pom-gen");
//		pluginExecution.setPhase("process-resources");
//		pluginExecution.setId("template");
//
//		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
//		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
//		artifactLocationNode.setValue(".");
//		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
//		typeListNode.setValue("${artifact.types}");
//		pluginExecution.setConfiguration(configurationNode);
//		plugin.addExecution(pluginExecution);
//		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
//	}
	
//	public void copyImportFile(IContainer importLocation,boolean isNewAritfact, String groupId) throws IOException {
//		super.copyImportFile(importLocation, isNewAritfact, groupId);
//		File importFile = getModel().getImportFile();
//		File destFile = null;
//		List<OMElement> selectedSeqList = ((TemplateModel)getModel()).getSelectedTempSequenceList();
//		if(selectedSeqList != null && selectedSeqList.size() >0 ){
//			for (OMElement element : selectedSeqList) {
//				String name = element.getAttributeValue(new QName("name"));
//				destFile = new File(importLocation.getLocation().toFile(), name + ".xml");
//				FileUtils.createFile(destFile, element.toString());
//				fileLst.add(destFile);
//				if(isNewAritfact){
//					ESBArtifact artifact = new ESBArtifact();
//					artifact.setName(name);
//					artifact.setVersion(version);
//					artifact.setType("synapse/template");
//					artifact.setServerRole("EnterpriseServiceBus");
//					artifact.setGroupId(groupId);
//					artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(),
//							new File(importLocation.getLocation().toFile(), name + ".xml")).replaceAll(
//							Pattern.quote(File.separator), "/"));
//					esbProjectArtifact.addESBArtifact(artifact);
//				}
//			} 
//		}else{
//			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
//			FileUtils.copy(importFile, destFile);
//			fileLst.add(destFile);
//			String name = importFile.getName().replaceAll(".xml$","");
//			if(isNewAritfact){
//				ESBArtifact artifact = new ESBArtifact();
//				artifact.setName(name);
//				artifact.setVersion(version);
//				artifact.setType("synapse/template");
//				artifact.setServerRole("EnterpriseServiceBus");
//				artifact.setGroupId(groupId);
//				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(),
//						new File(importLocation.getLocation().toFile(), name + ".xml")).replaceAll(
//						Pattern.quote(File.separator), "/"));
//				esbProjectArtifact.addESBArtifact(artifact);
//			}
//		}
//	}
	
	protected boolean isRequiredWorkingSet() {
		return false;
	}
			
//	public void openEditor(File file) {
//		super.openEditor(file);
//		try {
//			refreshDistProjects();
//			OMElement documentElement = new StAXOMBuilder(new FileInputStream(file))
//					.getDocumentElement();
//			String templateType = "";
//
//			if (documentElement.getChildrenWithName(new QName("endpoint")) != null
//					&& documentElement.getChildrenWithName(new QName("endpoint")).hasNext()) {
//				// Endpoint template.
//				templateType = ArtifactType.TEMPLATE_ENDPOINT.getLiteral();
//				OMElement endpoint = (OMElement) documentElement.getChildrenWithName(
//						new QName("endpoint")).next();
//				String localName = endpoint.getFirstElement().getLocalName();
//				if ("address".equals(localName)) {
//					// Address endpoint template.
//					templateType = ArtifactType.TEMPLATE_ENDPOINT_ADDRESS.getLiteral();
//				} else if ("wsdl".equals(localName)) {
//					// WSDL endpoint template.
//					templateType = ArtifactType.TEMPLATE_ENDPOINT_WSDL.getLiteral();
//				} else if ("http".equals(localName)) {
//					// HTTP endpoint template.
//					templateType = ArtifactType.TEMPLATE_ENDPOINT_HTTP.getLiteral();
//				} else {
//					// Default endpoint template. 
//					templateType = ArtifactType.TEMPLATE_ENDPOINT_DEFAULT.getLiteral();
//				}
//			} else {
//				// Sequence template.
//				templateType = ArtifactType.TEMPLATE_SEQUENCE.getLiteral();
//			}
//
//			IFile dbsFile = ResourcesPlugin.getWorkspace().getRoot()
//					.getFileForLocation(Path.fromOSString(file.getAbsolutePath()));
//			String path = dbsFile.getParent().getFullPath() + "/";
//			String source = FileUtils.getContentAsString(file);
//			Openable openable = ESBGraphicalEditor.getOpenable();
//			openable.editorOpen(file.getName(), templateType, path, source);
//		} catch (Exception e) {
//			log.error("Cannot open the editor", e);
//		}
//	}

	@Override
	public IResource getCreatedResource() {
		// TODO Auto-generated method stub
		return null;
	} 

}
