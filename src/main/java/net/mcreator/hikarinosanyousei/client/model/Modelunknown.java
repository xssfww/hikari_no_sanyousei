package net.mcreator.hikarinosanyousei.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelunknown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hikari_no_sanyousei", "modelunknown"), "main");
	public final ModelPart AllHead;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Root;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelunknown(ModelPart root) {
		this.AllHead = root.getChild("AllHead");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Root = root.getChild("Root");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition AllHead = partdefinition.addOrReplaceChild("AllHead", CubeListBuilder.create(), PartPose.offset(-0.176F, -10.811F, 0.0F));
		PartDefinition Head = AllHead.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 18).addBox(-4.5146F, -8.4733F, -4.9514F, 0.5825F, 8.6604F, 9.3204F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-4.2233F, -8.2533F, -4.9514F, 8.7378F, 0.285F, 9.3204F, new CubeDeformation(0.0F)).texOffs(20, 18).addBox(-3.2633F, -9.7739F, -4.3879F, 6.8177F, 1.3842F, 7.2464F, new CubeDeformation(0.0F)).texOffs(0, 141)
						.addBox(-2.1765F, -9.7739F, 2.8017F, 4.6441F, 1.3842F, 1.2316F, new CubeDeformation(0.0F)).texOffs(44, 55).addBox(-4.2233F, -7.9682F, -4.9514F, 8.7378F, 4.0729F, 1.7476F, new CubeDeformation(0.0F)).texOffs(28, 158)
						.addBox(-1.2033F, -3.9682F, -4.9514F, 2.7586F, 2.7119F, 1.7476F, new CubeDeformation(0.0F)).texOffs(78, 61).addBox(-3.9321F, -1.3562F, -4.9514F, 8.1553F, 1.5433F, 1.7476F, new CubeDeformation(0.0F)).texOffs(36, 9)
						.addBox(-4.2233F, -0.7595F, -3.2184F, 8.7378F, 0.9466F, 7.5874F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.2233F, -7.9682F, -4.2181F, 8.7378F, 7.2815F, 8.587F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(4.2232F, -8.6933F, -4.9514F, 0.5825F, 8.8804F, 9.3204F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.044F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(39, 269).addBox(-0.2321F, -0.7801F, -0.9062F, 0.8821F, 1.3842F, 1.3944F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5041F, -8.9938F, 3.5754F, 0.0F, 0.384F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(24, 248).addBox(-0.65F, -0.7801F, -0.9062F, 0.8821F, 1.3842F, 1.3944F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8561F, -8.9938F, 3.5754F, 0.0F, -0.384F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(92, 94).addBox(-2.9909F, -0.6833F, -0.6598F, 5.9817F, 0.7858F, 1.7332F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1456F, -8.783F, 3.7784F, -0.9599F, 0.0F, 0.0F));
		PartDefinition bone72 = Head.addOrReplaceChild("bone72", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0277F, 44.9756F, -0.6887F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone72_r1 = bone72.addOrReplaceChild("bone72_r1", CubeListBuilder.create().texOffs(86, 84).addBox(-4.1438F, 2.7398F, -0.444F, 4.4511F, 7.9123F, 0.7714F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.1847F, -0.0806F, 1.9648F));
		PartDefinition bone72_r2 = bone72.addOrReplaceChild("bone72_r2", CubeListBuilder.create().texOffs(76, 94).addBox(-2.9626F, 1.3394F, -0.5088F, 3.2265F, 8.8729F, 0.9144F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.2105F, -0.0869F, 1.6584F));
		PartDefinition bone72_r3 = bone72.addOrReplaceChild("bone72_r3", CubeListBuilder.create().texOffs(86, 114).addBox(-4.0761F, 2.3245F, -0.7626F, 3.2265F, 7.0323F, 0.8228F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.2917F, -0.082F, 1.2205F));
		PartDefinition bone72_r4 = bone72.addOrReplaceChild("bone72_r4", CubeListBuilder.create().texOffs(94, 114).addBox(0.8496F, 2.3245F, -0.7626F, 3.2265F, 7.0323F, 0.8228F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.2917F, 0.082F, -1.2205F));
		PartDefinition bone72_r5 = bone72.addOrReplaceChild("bone72_r5", CubeListBuilder.create().texOffs(84, 94).addBox(-0.2639F, 1.3394F, -0.5088F, 3.2265F, 8.8729F, 0.9144F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.2105F, 0.0869F, -1.6584F));
		PartDefinition bone72_r6 = bone72.addOrReplaceChild("bone72_r6", CubeListBuilder.create().texOffs(71, 142).addBox(-1.7897F, -4.5419F, -0.9208F, 3.2265F, 4.8398F, 1.9756F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3247F, -50.1059F, 12.7259F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone72_r7 = bone72.addOrReplaceChild("bone72_r7", CubeListBuilder.create().texOffs(96, 84).addBox(-0.3073F, 2.7398F, -0.444F, 4.4511F, 7.9123F, 0.7714F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1483F, -50.1059F, 12.7259F, 0.1847F, 0.0806F, -1.9648F));
		PartDefinition bone71 = bone72.addOrReplaceChild("bone71", CubeListBuilder.create(), PartPose.offsetAndRotation(9.4316F, -55.5307F, 14.2208F, 0.3027F, -0.0447F, 0.1231F));
		PartDefinition bone73 = bone71.addOrReplaceChild("bone73", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4329F, 16.4868F, -7.6469F, -0.0524F, -0.201F, -1.4286F));
		PartDefinition bone73_r1 = bone73.addOrReplaceChild("bone73_r1", CubeListBuilder.create().texOffs(6, 268).addBox(-1.8109F, -0.4057F, 0.0796F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.3084F, 1.9918F, 4.6864F, 0.3036F, -0.0604F, -0.5873F));
		PartDefinition bone73_r2 = bone73.addOrReplaceChild("bone73_r2", CubeListBuilder.create().texOffs(0, 271).addBox(-0.1361F, -0.4057F, 1.8109F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.3084F, 1.9918F, 4.6864F, 1.7703F, -1.2615F, -2.3483F));
		PartDefinition bone74 = bone71.addOrReplaceChild("bone74", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3051F, 12.8831F, -7.1116F, -0.0344F, -0.2048F, -1.5176F));
		PartDefinition bone74_r1 = bone74.addOrReplaceChild("bone74_r1",
				CubeListBuilder.create().texOffs(22, 270).addBox(-0.2434F, -0.5043F, 1.066F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271)
						.addBox(-0.2434F, -0.5043F, -2.1686F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271).addBox(-0.2434F, -0.5043F, -1.36F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271)
						.addBox(-0.2434F, -0.5043F, -0.5513F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271).addBox(-0.2434F, -0.5043F, 0.2573F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4262F, 3.6365F, 4.8975F, 1.6155F, -1.2642F, -2.1871F));
		PartDefinition bone74_r2 = bone74.addOrReplaceChild("bone74_r2",
				CubeListBuilder.create().texOffs(2, 268).addBox(1.36F, -0.5043F, -0.0277F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(6, 270).addBox(2.1686F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F))
						.texOffs(2, 269).addBox(-0.2573F, -0.5043F, -0.0277F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(4, 268).addBox(0.5513F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F))
						.texOffs(4, 269).addBox(-1.066F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4262F, 3.6365F, 4.8975F, 0.3063F, -0.0135F, -0.5737F));
		PartDefinition bone80 = bone72.addOrReplaceChild("bone80", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.1349F, -55.5307F, 14.2208F, 0.3027F, 0.0447F, -0.1231F));
		PartDefinition bone81 = bone80.addOrReplaceChild("bone81", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4329F, 16.4868F, -7.6469F, -0.0524F, 0.201F, 1.4286F));
		PartDefinition bone81_r1 = bone81.addOrReplaceChild("bone81_r1", CubeListBuilder.create().texOffs(0, 269).addBox(1.137F, -0.4057F, 0.0796F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.3084F, 1.9918F, 4.6864F, 0.3036F, 0.0604F, 0.5873F));
		PartDefinition bone81_r2 = bone81.addOrReplaceChild("bone81_r2", CubeListBuilder.create().texOffs(0, 271).addBox(-0.3402F, -0.4057F, 1.8109F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.3084F, 1.9918F, 4.6864F, 1.7703F, 1.2615F, 2.3483F));
		PartDefinition bone82 = bone80.addOrReplaceChild("bone82", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3051F, 12.8831F, -7.1116F, -0.0344F, 0.2048F, 1.5176F));
		PartDefinition bone82_r1 = bone82.addOrReplaceChild("bone82_r1",
				CubeListBuilder.create().texOffs(20, 270).addBox(-0.3138F, -0.5043F, 1.066F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271)
						.addBox(-0.2329F, -0.5043F, -2.1686F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271).addBox(-0.2329F, -0.5043F, -1.36F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271)
						.addBox(-0.2329F, -0.5043F, -0.5513F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(0, 271).addBox(-0.2329F, -0.5043F, 0.2573F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.4262F, 3.6365F, 4.8975F, 1.6155F, 1.2642F, 2.1871F));
		PartDefinition bone82_r2 = bone82.addOrReplaceChild("bone82_r2",
				CubeListBuilder.create().texOffs(40, 266).addBox(-2.0339F, -0.5043F, -0.0277F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(4, 270)
						.addBox(-2.8425F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(40, 267).addBox(-0.4166F, -0.5043F, -0.0277F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(42, 265)
						.addBox(-1.2252F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(0, 268).addBox(0.3921F, -0.5043F, -0.2434F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.4262F, 3.6365F, 4.8975F, 0.3063F, 0.0135F, 0.5737F));
		PartDefinition bone76 = bone72.addOrReplaceChild("bone76", CubeListBuilder.create(), PartPose.offsetAndRotation(12.4236F, -49.4234F, 13.4167F, 0.3473F, 0.0388F, 0.8589F));
		PartDefinition bone78 = bone76.addOrReplaceChild("bone78", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4329F, 16.4868F, -7.6469F, -0.0524F, -0.201F, -1.4286F));
		PartDefinition bone78_r1 = bone78.addOrReplaceChild("bone78_r1", CubeListBuilder.create().texOffs(32, 265).addBox(-1.8109F, -0.4057F, 0.0796F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0882F, 0.3437F, 5.504F, 0.3036F, -0.0604F, -0.5873F));
		PartDefinition bone78_r2 = bone78.addOrReplaceChild("bone78_r2", CubeListBuilder.create().texOffs(20, 270).addBox(-0.1361F, -0.4057F, 1.8109F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0882F, 0.3437F, 5.504F, 1.7703F, -1.2615F, -2.3483F));
		PartDefinition bone79 = bone76.addOrReplaceChild("bone79", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3051F, 12.8831F, -7.1116F, -0.0344F, -0.2048F, -1.5176F));
		PartDefinition bone79_r1 = bone79.addOrReplaceChild("bone79_r1",
				CubeListBuilder.create().texOffs(18, 270).addBox(-0.2434F, -0.5043F, 1.066F, 0.5572F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270)
						.addBox(-0.2434F, -0.5043F, -1.36F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270).addBox(-0.2434F, -0.5043F, -0.5513F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270)
						.addBox(-0.2434F, -0.5043F, 0.2573F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.3581F, 1.8011F, 5.7151F, 1.6155F, -1.2642F, -2.1871F));
		PartDefinition bone79_r2 = bone79.addOrReplaceChild("bone79_r2",
				CubeListBuilder.create().texOffs(30, 265).addBox(-0.2573F, -0.5043F, -0.0277F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)).texOffs(30, 266)
						.addBox(0.5513F, -0.5043F, -0.2434F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)).texOffs(30, 267).addBox(-1.066F, -0.5043F, -0.2434F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.3581F, 1.8011F, 5.7151F, 0.3063F, -0.0135F, -0.5737F));
		PartDefinition bone84 = bone72.addOrReplaceChild("bone84", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.1269F, -49.4234F, 13.4167F, 0.3473F, -0.0388F, -0.8589F));
		PartDefinition bone92 = bone84.addOrReplaceChild("bone92", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4329F, 16.4868F, -7.6469F, -0.0524F, 0.201F, 1.4286F));
		PartDefinition bone92_r1 = bone92.addOrReplaceChild("bone92_r1", CubeListBuilder.create().texOffs(28, 267).addBox(1.137F, -0.4057F, 0.0796F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0882F, 0.3437F, 5.504F, 0.3036F, 0.0604F, 0.5873F));
		PartDefinition bone92_r2 = bone92.addOrReplaceChild("bone92_r2", CubeListBuilder.create().texOffs(20, 270).addBox(-0.3402F, -0.4057F, 1.8109F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0882F, 0.3437F, 5.504F, 1.7703F, 1.2615F, 2.3483F));
		PartDefinition bone93 = bone84.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3051F, 12.8831F, -7.1116F, -0.0344F, 0.2048F, 1.5176F));
		PartDefinition bone93_r1 = bone93.addOrReplaceChild("bone93_r1",
				CubeListBuilder.create().texOffs(16, 270).addBox(-0.3138F, -0.5043F, 1.066F, 0.5572F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270)
						.addBox(-0.2329F, -0.5043F, -1.36F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270).addBox(-0.2329F, -0.5043F, -0.5513F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)).texOffs(20, 270)
						.addBox(-0.2329F, -0.5043F, 0.2573F, 0.4763F, 1.2991F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.3581F, 1.8011F, 5.7151F, 1.6155F, 1.2642F, 2.1871F));
		PartDefinition bone93_r2 = bone93.addOrReplaceChild("bone93_r2",
				CubeListBuilder.create().texOffs(26, 267).addBox(-0.4166F, -0.5043F, -0.0277F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)).texOffs(28, 265)
						.addBox(-1.2252F, -0.5043F, -0.2434F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)).texOffs(28, 266).addBox(0.3921F, -0.5043F, -0.2434F, 0.6739F, 1.2991F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.3581F, 1.8011F, 5.7151F, 0.3063F, 0.0135F, 0.5737F));
		PartDefinition bone75 = bone72.addOrReplaceChild("bone75", CubeListBuilder.create(), PartPose.offsetAndRotation(10.3116F, -50.9777F, 14.4202F, 0.3326F, -0.0335F, 0.3949F));
		PartDefinition bone77 = bone75.addOrReplaceChild("bone77", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2831F, 12.9984F, -6.8752F, -0.0344F, -0.2048F, -1.5176F));
		PartDefinition bone77_r1 = bone77.addOrReplaceChild("bone77_r1",
				CubeListBuilder.create().texOffs(36, 270).addBox(-0.2434F, -0.5043F, -2.1686F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(36, 270)
						.addBox(-0.2434F, -0.5043F, -1.36F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(36, 270).addBox(-0.2434F, -0.5043F, -0.5513F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4263F, 3.6365F, 4.8975F, 1.6155F, -1.2642F, -2.1871F));
		PartDefinition bone77_r2 = bone77.addOrReplaceChild("bone77_r2",
				CubeListBuilder.create().texOffs(34, 267).addBox(1.36F, -0.5043F, -0.0277F, 0.6739F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)).texOffs(36, 267)
						.addBox(2.1686F, -0.5043F, -0.2434F, 0.8499F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(26, 266).addBox(-0.5213F, -0.5043F, -0.0277F, 0.9379F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)).texOffs(36, 265)
						.addBox(0.5513F, -0.5043F, -0.2434F, 0.6739F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4263F, 3.6365F, 4.8975F, 0.3063F, -0.0135F, -0.5737F));
		PartDefinition bone83 = bone72.addOrReplaceChild("bone83", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0149F, -50.9777F, 14.4202F, 0.3326F, 0.0335F, -0.3949F));
		PartDefinition bone101 = bone83.addOrReplaceChild("bone101", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2831F, 12.9984F, -6.8752F, -0.0344F, 0.2048F, 1.5176F));
		PartDefinition bone101_r1 = bone101.addOrReplaceChild("bone101_r1",
				CubeListBuilder.create().texOffs(36, 270).addBox(-0.2329F, -0.5043F, -2.1686F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(36, 270)
						.addBox(-0.2329F, -0.5043F, -1.36F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(36, 270).addBox(-0.2329F, -0.5043F, -0.5513F, 0.4763F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.4263F, 3.6365F, 4.8975F, 1.6155F, 1.2642F, 2.1871F));
		PartDefinition bone101_r2 = bone101.addOrReplaceChild("bone101_r2",
				CubeListBuilder.create().texOffs(34, 265).addBox(-2.0338F, -0.5043F, -0.0277F, 0.6739F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)).texOffs(36, 266)
						.addBox(-3.0185F, -0.5043F, -0.2434F, 0.8499F, 1.2111F, 0.1348F, new CubeDeformation(0.0F)).texOffs(26, 265).addBox(-0.4165F, -0.5043F, -0.0277F, 0.9379F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)).texOffs(34, 266)
						.addBox(-1.2252F, -0.5043F, -0.2434F, 0.6739F, 1.2111F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.4263F, 3.6365F, 4.8975F, 0.3063F, 0.0135F, 0.5737F));
		PartDefinition bone68 = bone72.addOrReplaceChild("bone68", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7449F, -43.2005F, 14.6277F, -0.0787F, -0.067F, -0.2533F));
		PartDefinition bone68_r1 = bone68.addOrReplaceChild("bone68_r1", CubeListBuilder.create().texOffs(82, 145).addBox(-4.1741F, 0.3519F, -1.8594F, 2.5885F, 4.0535F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8161F, -5.1248F, -2.6677F, 0.4154F, 0.0987F, 0.4771F));
		PartDefinition bone68_r2 = bone68.addOrReplaceChild("bone68_r2", CubeListBuilder.create().texOffs(8, 131).addBox(-1.5587F, 4.5675F, -1.8594F, 2.5885F, 5.5847F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8161F, -5.1248F, -2.6677F, 0.4062F, -0.133F, 0.9961F));
		PartDefinition bone68_r3 = bone68.addOrReplaceChild("bone68_r3", CubeListBuilder.create().texOffs(16, 187).addBox(-1.2942F, -2.7924F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9953F, 0.1441F, 1.0884F, 0.3612F, -0.2316F, 1.2429F));
		PartDefinition bone68_r4 = bone68.addOrReplaceChild("bone68_r4", CubeListBuilder.create().texOffs(84, 243).addBox(-1.3823F, -1.1204F, -0.7392F, 1.3565F, 1.2727F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3823F, 2.6699F, 0.7442F, 0.0942F, -0.2424F, 0.3886F));
		PartDefinition bone68_r5 = bone68.addOrReplaceChild("bone68_r5", CubeListBuilder.create().texOffs(74, 224).addBox(-0.0623F, -1.1204F, -0.7389F, 1.3565F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.149F, 2.4355F, 0.7459F, 0.145F, -0.2163F, 0.1661F));
		PartDefinition bone68_r6 = bone68.addOrReplaceChild("bone68_r6", CubeListBuilder.create().texOffs(0, 187).addBox(-1.2942F, 1.4316F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7596F, -0.6978F, 0.629F, 0.0038F, -0.2597F, 0.7486F));
		PartDefinition bone68_r7 = bone68.addOrReplaceChild("bone68_r7", CubeListBuilder.create().texOffs(16, 190).addBox(-1.2942F, -1.0324F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1204F, 0.2738F, 0.7382F, -0.1188F, -0.2316F, 1.2429F));
		PartDefinition bone55 = bone72.addOrReplaceChild("bone55", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0415F, -43.2005F, 14.6277F, -0.0787F, 0.067F, 0.2533F));
		PartDefinition bone69_r1 = bone55.addOrReplaceChild("bone69_r1", CubeListBuilder.create().texOffs(82, 145).mirror().addBox(1.5856F, 0.3519F, -1.8594F, 2.5885F, 4.0535F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.8161F, -5.1248F, -2.6677F, 0.4154F, -0.0987F, -0.4771F));
		PartDefinition bone69_r2 = bone55.addOrReplaceChild("bone69_r2", CubeListBuilder.create().texOffs(8, 131).mirror().addBox(-1.0298F, 4.5675F, -1.8594F, 2.5885F, 5.5847F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.8161F, -5.1248F, -2.6677F, 0.4062F, 0.133F, -0.9961F));
		PartDefinition bone69_r3 = bone55.addOrReplaceChild("bone69_r3", CubeListBuilder.create().texOffs(16, 187).mirror().addBox(-1.2942F, -2.7924F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9953F, 0.1441F, 1.0884F, 0.3612F, 0.2316F, -1.2429F));
		PartDefinition bone69_r4 = bone55.addOrReplaceChild("bone69_r4", CubeListBuilder.create().texOffs(84, 243).mirror().addBox(0.0258F, -1.1204F, -0.7392F, 1.3565F, 1.2727F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3823F, 2.6699F, 0.7442F, 0.0942F, 0.2424F, -0.3886F));
		PartDefinition bone69_r5 = bone55.addOrReplaceChild("bone69_r5", CubeListBuilder.create().texOffs(74, 224).mirror().addBox(-1.2942F, -1.1204F, -0.7389F, 1.3565F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.149F, 2.4355F, 0.7459F, 0.145F, 0.2163F, -0.1661F));
		PartDefinition bone69_r6 = bone55.addOrReplaceChild("bone69_r6", CubeListBuilder.create().texOffs(0, 187).mirror().addBox(-1.2942F, 1.4316F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7596F, -0.6978F, 0.629F, 0.0038F, 0.2597F, -0.7486F));
		PartDefinition bone69_r7 = bone55.addOrReplaceChild("bone69_r7", CubeListBuilder.create().texOffs(16, 190).mirror().addBox(-1.2942F, -1.0324F, -0.7392F, 2.5885F, 2.2407F, 1.4784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1204F, 0.2738F, 0.7382F, -0.1188F, 0.2316F, -1.2429F));
		PartDefinition bone67 = Head.addOrReplaceChild("bone67", CubeListBuilder.create(), PartPose.offsetAndRotation(0.176F, 9.9774F, -0.9504F, -0.1309F, 0.0F, 0.0F));
		PartDefinition earth4 = Head.addOrReplaceChild("earth4", CubeListBuilder.create(), PartPose.offset(0.0836F, -12.6471F, -0.2006F));
		PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create(), PartPose.offset(0.0088F, -1.6738F, 0.0F));
		PartDefinition Eyes = Face.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(-0.1368F, 25.3462F, 0.0F));
		PartDefinition Eyelid = Eyes.addOrReplaceChild("Eyelid", CubeListBuilder.create(), PartPose.offset(0.198F, -27.9224F, -5.0971F));
		PartDefinition LeftEyelid = Eyelid.addOrReplaceChild("LeftEyelid", CubeListBuilder.create().texOffs(8, 172).addBox(-1.6019F, -1.3107F, -0.6441F, 3.2039F, 3.0393F, 1.165F, new CubeDeformation(0.0F)),
				PartPose.offset(2.8425F, 1.4563F, 1.3107F));
		PartDefinition LeftEyelidBase = LeftEyelid.addOrReplaceChild("LeftEyelidBase", CubeListBuilder.create().texOffs(100, 224).addBox(-0.6403F, -1.1007F, -0.613F, 1.6213F, 2.5391F, 1.165F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7281F, 0.0F, -0.2913F));
		PartDefinition RightEyelid = Eyelid.addOrReplaceChild("RightEyelid", CubeListBuilder.create().texOffs(8, 168).addBox(-1.6019F, -1.3107F, -0.6441F, 3.2039F, 3.0393F, 1.165F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.6914F, 1.4563F, 1.3107F));
		PartDefinition RightEyelidBase = RightEyelid.addOrReplaceChild("RightEyelidBase", CubeListBuilder.create().texOffs(100, 224).addBox(-0.8162F, -0.956F, -0.6133F, 1.6213F, 2.5391F, 1.165F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5825F, -0.1456F, -0.2913F));
		PartDefinition zuo_xia_yan_pi = Eyelid.addOrReplaceChild("zuo_xia_yan_pi", CubeListBuilder.create().texOffs(34, 237).addBox(-1.6019F, -0.3101F, -0.1456F, 3.2039F, 1.0383F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(2.8425F, 3.4951F, 0.3641F));
		PartDefinition you_xia_yan_pi = Eyelid.addOrReplaceChild("you_xia_yan_pi", CubeListBuilder.create().texOffs(28, 240).addBox(-1.6019F, -0.3101F, -0.1456F, 3.2039F, 1.0383F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.6914F, 3.4951F, 0.3641F));
		PartDefinition zuo_mei_mao2 = Eyelid.addOrReplaceChild("zuo_mei_mao2", CubeListBuilder.create().texOffs(38, 245).addBox(-1.6463F, -0.1368F, -0.1456F, 3.2925F, 0.2735F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(2.9046F, -0.9771F, 0.0F));
		PartDefinition you_mei_mao2 = Eyelid.addOrReplaceChild("you_mei_mao2", CubeListBuilder.create().texOffs(38, 245).addBox(-1.6462F, -0.1368F, -0.1456F, 3.2925F, 0.2735F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.6572F, -0.9771F, 0.0F));
		PartDefinition LeftEyebrow = Eyes.addOrReplaceChild("LeftEyebrow", CubeListBuilder.create().texOffs(52, 212).addBox(-2.3042F, -3.1646F, -0.1456F, 3.2039F, 3.2393F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(3.7428F, -27.8515F, -4.733F));
		PartDefinition zuo_mei_mao = LeftEyebrow.addOrReplaceChild("zuo_mei_mao", CubeListBuilder.create().texOffs(20, 264).addBox(-0.8738F, -0.2913F, -0.1456F, 1.7476F, 0.5825F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0259F, -0.0075F, -0.3641F));
		PartDefinition zuo_mei_mao_small = zuo_mei_mao.addOrReplaceChild("zuo_mei_mao_small", CubeListBuilder.create().texOffs(20, 263).addBox(-1.7653F, -0.0392F, 0.0F, 1.7476F, 0.5825F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.8561F, -0.252F, -0.1456F));
		PartDefinition RightEyebrow = Eyes.addOrReplaceChild("RightEyebrow", CubeListBuilder.create().texOffs(46, 212).addBox(-0.8997F, -3.1646F, -0.1456F, 3.2039F, 3.2393F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.1957F, -27.6425F, -4.733F));
		PartDefinition you_mei_mao = RightEyebrow.addOrReplaceChild("you_mei_mao", CubeListBuilder.create().texOffs(22, 272).addBox(-0.8738F, -0.2913F, -0.1456F, 1.7476F, 0.5825F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0259F, -0.2165F, -0.3641F));
		PartDefinition you_mei_mao_small = you_mei_mao.addOrReplaceChild("you_mei_mao_small", CubeListBuilder.create().texOffs(17, 272).addBox(0.0354F, -0.0418F, -0.1456F, 1.7476F, 0.5825F, 0.2913F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8383F, -0.2495F, 0.0F));
		PartDefinition hair = Head.addOrReplaceChild("hair", CubeListBuilder.create(), PartPose.offset(0.3432F, -57.7174F, 0.0F));
		PartDefinition bone54 = hair.addOrReplaceChild("bone54", CubeListBuilder.create(), PartPose.offset(5.0598F, 50.15F, -4.821F));
		PartDefinition bone54_r1 = bone54.addOrReplaceChild("bone54_r1", CubeListBuilder.create().texOffs(80, 111).addBox(-3.0569F, -1.0441F, -0.3672F, 6.1137F, 1.4722F, 0.9104F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2574F, -1.9465F, -0.0797F, -0.0698F, 0.0F, 0.0F));
		PartDefinition bone5 = bone54.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.669F, -0.9186F, -0.0366F, 0.0174F, -0.0015F, -0.0436F));
		PartDefinition bone5_r1 = bone5.addOrReplaceChild("bone5_r1", CubeListBuilder.create().texOffs(40, 191).addBox(-0.6892F, -2.0426F, -0.4957F, 2.4926F, 1.8236F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2881F, 0.4226F, -0.0953F, 0.0807F, -0.0334F, -2.2266F));
		PartDefinition bone5_r2 = bone5.addOrReplaceChild("bone5_r2", CubeListBuilder.create().texOffs(48, 224).addBox(-1.8106F, -0.6235F, -0.4957F, 1.8739F, 1.0715F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0119F, 4.0748F, -0.3152F, 0.0285F, -0.0825F, -1.38F));
		PartDefinition bone5_r3 = bone5.addOrReplaceChild("bone5_r3", CubeListBuilder.create().texOffs(28, 203).addBox(-0.8575F, -0.7824F, -0.4957F, 1.8739F, 2.2555F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.295F, 3.498F, -0.2849F, 0.0707F, -0.0513F, -1.9915F));
		PartDefinition bone5_r4 = bone5.addOrReplaceChild("bone5_r4", CubeListBuilder.create().texOffs(52, 203).addBox(-0.8576F, -0.9823F, -0.5001F, 1.8987F, 2.0243F, 1.6117F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1609F, 2.1378F, -0.2197F, 0.0857F, -0.0166F, -2.4267F));
		PartDefinition bone5_r5 = bone5.addOrReplaceChild("bone5_r5", CubeListBuilder.create().texOffs(70, 158).addBox(-1.2636F, -1.0997F, -0.9555F, 2.8792F, 2.1994F, 1.6909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8498F, -0.1886F, 0.4317F, 0.0866F, -0.0106F, -2.4963F));
		PartDefinition bone5_r6 = bone5.addOrReplaceChild("bone5_r6", CubeListBuilder.create().texOffs(52, 182).addBox(-1.4619F, -1.5162F, -0.5793F, 2.5272F, 2.1994F, 1.6909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.669F, 0.9186F, 0.0366F, 0.0715F, -0.05F, -2.0089F));
		PartDefinition bone5_r7 = bone5.addOrReplaceChild("bone5_r7", CubeListBuilder.create().texOffs(0, 224).addBox(-1.872F, -0.2807F, -0.4121F, 2.2352F, 0.7287F, 1.5237F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7335F, 4.1192F, -0.287F, -0.0038F, -0.0872F, -1.0034F));
		PartDefinition bone12 = bone5.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8211F, 3.7344F, -0.1649F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone12_r1 = bone12.addOrReplaceChild("bone12_r1", CubeListBuilder.create().texOffs(62, 251).addBox(-0.2745F, -0.1826F, -0.481F, 0.6326F, 0.616F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1191F, 1.6511F, -0.1715F, 0.0321F, -0.0812F, -1.4237F));
		PartDefinition bone12_r2 = bone12.addOrReplaceChild("bone12_r2", CubeListBuilder.create().texOffs(85, 237).addBox(-0.751F, -0.1826F, -0.481F, 1.1844F, 0.4446F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4707F, 1.1824F, -0.1513F, 0.0607F, -0.0627F, -1.817F));
		PartDefinition bone12_r3 = bone12.addOrReplaceChild("bone12_r3", CubeListBuilder.create().texOffs(34, 246).addBox(-0.4334F, -0.262F, -0.481F, 0.8709F, 0.6954F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0549F, 0.9649F, -0.1167F, 0.039F, -0.0781F, -1.5112F));
		PartDefinition bone12_r4 = bone12.addOrReplaceChild("bone12_r4", CubeListBuilder.create().texOffs(36, 209).addBox(-0.7113F, -0.4606F, -0.481F, 2.4259F, 1.172F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4958F, 0.0734F, -0.0684F, 0.0634F, -0.06F, -1.8607F));
		PartDefinition bone2 = bone54.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.785F, -0.9186F, -0.0366F, 0.0174F, 0.0015F, 0.0436F));
		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(40, 187).addBox(-1.8915F, -1.8926F, -0.4957F, 2.5806F, 1.6736F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2881F, 0.4226F, -0.0953F, 0.0807F, 0.0334F, 2.2266F));
		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(40, 224).addBox(-0.0634F, -0.6235F, -0.4957F, 1.8739F, 1.0715F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, 4.0748F, -0.3152F, 0.0285F, 0.0825F, 1.38F));
		PartDefinition bone2_r3 = bone2.addOrReplaceChild("bone2_r3", CubeListBuilder.create().texOffs(59, 206).addBox(-1.0164F, -0.7824F, -0.4957F, 1.8739F, 2.2555F, 1.6073F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.295F, 3.498F, -0.2849F, 0.0707F, 0.0513F, 1.9915F));
		PartDefinition bone2_r4 = bone2.addOrReplaceChild("bone2_r4", CubeListBuilder.create().texOffs(24, 217).addBox(-0.9411F, -0.7823F, -0.5001F, 1.7987F, 1.8243F, 1.6117F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1609F, 2.1378F, -0.2197F, 0.0857F, 0.0166F, 2.4267F));
		PartDefinition bone2_r5 = bone2.addOrReplaceChild("bone2_r5", CubeListBuilder.create().texOffs(60, 164).addBox(-1.6156F, -1.0997F, -0.9555F, 2.8792F, 2.1994F, 1.6909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8498F, -0.1886F, 0.4317F, 0.0866F, 0.0106F, 2.4963F));
		PartDefinition bone2_r6 = bone2.addOrReplaceChild("bone2_r6", CubeListBuilder.create().texOffs(52, 178).addBox(-1.0652F, -1.5162F, -0.5793F, 2.5272F, 2.1994F, 1.6909F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.669F, 0.9186F, 0.0366F, 0.0715F, 0.05F, 2.0089F));
		PartDefinition bone2_r7 = bone2.addOrReplaceChild("bone2_r7", CubeListBuilder.create().texOffs(60, 207).addBox(-0.3632F, -0.2807F, -0.4121F, 2.2352F, 0.7287F, 1.5237F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7335F, 4.1192F, -0.287F, -0.0038F, 0.0872F, 1.0034F));
		PartDefinition bone8 = bone2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8211F, 3.7344F, -0.1649F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1", CubeListBuilder.create().texOffs(56, 251).addBox(-0.3581F, -0.1826F, -0.481F, 0.6326F, 0.616F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1191F, 1.6511F, -0.1715F, 0.0321F, 0.0812F, 1.4237F));
		PartDefinition bone8_r2 = bone8.addOrReplaceChild("bone8_r2", CubeListBuilder.create().texOffs(60, 241).addBox(-0.4334F, -0.1826F, -0.481F, 1.1844F, 0.4446F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4707F, 1.1824F, -0.1513F, 0.0607F, 0.0627F, 1.817F));
		PartDefinition bone8_r3 = bone8.addOrReplaceChild("bone8_r3", CubeListBuilder.create().texOffs(38, 269).addBox(-0.4375F, -0.262F, -0.481F, 0.8709F, 0.6954F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0549F, 0.9649F, -0.1167F, 0.039F, 0.0781F, 1.5112F));
		PartDefinition bone8_r4 = bone8.addOrReplaceChild("bone8_r4", CubeListBuilder.create().texOffs(36, 206).addBox(-1.7145F, -0.4606F, -0.481F, 2.4259F, 1.172F, 1.5781F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4958F, 0.0734F, -0.0684F, 0.0634F, 0.06F, 1.8607F));
		PartDefinition bone6 = bone54.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8429F, -1.6646F, -0.1075F, 0.0F, 0.0F, 0.2094F));
		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(56, 259).addBox(-0.5059F, -1.1979F, -0.2992F, 0.8118F, 1.9318F, 0.5984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6918F, 3.4972F, -0.302F, 0.0807F, 0.0334F, -3.0966F));
		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2", CubeListBuilder.create().texOffs(24, 263).addBox(-0.1346F, -1.565F, -0.4092F, 1.0118F, 1.1158F, 0.5984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4212F, 1.4212F, 0.0F, 0.0852F, 0.0189F, -2.9226F));
		PartDefinition bone6_r3 = bone6.addOrReplaceChild("bone6_r3", CubeListBuilder.create().texOffs(58, 248).addBox(-2.9002F, -0.8565F, -0.4277F, 2.0838F, 0.8885F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0384F, 2.095F, -0.0985F, 0.0618F, -0.0617F, -1.9654F));
		PartDefinition bone6_r4 = bone6.addOrReplaceChild("bone6_r4", CubeListBuilder.create().texOffs(80, 243).addBox(-0.2226F, -1.0893F, -0.5375F, 1.0998F, 2.124F, 0.7267F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4136F, 0.8053F, 0.0485F, 0.082F, 0.0298F, -3.0531F));
		PartDefinition bone6_r5 = bone6.addOrReplaceChild("bone6_r5", CubeListBuilder.create().texOffs(94, 255).addBox(-1.0469F, -0.8565F, -0.4277F, 1.5131F, 1.113F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2209F, 1.9979F, -0.0845F, 0.047F, -0.0736F, -1.7471F));
		PartDefinition bone6_r6 = bone6.addOrReplaceChild("bone6_r6", CubeListBuilder.create().texOffs(50, 251).addBox(-0.1982F, -0.8565F, -0.4919F, 1.5324F, 1.3972F, 0.7293F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3648F, 1.3466F, -0.027F, 0.0F, -0.0873F, -1.1781F));
		PartDefinition bone25 = bone54.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9949F, -1.5766F, -0.1075F, 0.0F, 0.0F, -0.2269F));
		PartDefinition bone25_r1 = bone25.addOrReplaceChild("bone25_r1", CubeListBuilder.create().texOffs(44, 259).addBox(-0.3739F, -2.7059F, -0.2992F, 0.8358F, 1.9438F, 0.5984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7233F, 2.3508F, -0.2099F, 0.0728F, 0.0481F, 2.995F));
		PartDefinition bone25_r2 = bone25.addOrReplaceChild("bone25_r2", CubeListBuilder.create().texOffs(76, 259).addBox(-0.3739F, -0.7339F, -0.2992F, 0.9238F, 1.4678F, 0.5984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8516F, 2.4925F, -0.2164F, 0.0788F, 0.0375F, 3.1343F));
		PartDefinition bone25_r3 = bone25.addOrReplaceChild("bone25_r3", CubeListBuilder.create().texOffs(60, 261).addBox(-0.9089F, -0.3123F, -0.3326F, 1.3418F, 0.6125F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4509F, 4.1982F, -0.3502F, 0.0679F, -0.0549F, -2.0701F));
		PartDefinition bone25_r4 = bone25.addOrReplaceChild("bone25_r4", CubeListBuilder.create().texOffs(20, 265).addBox(-1.6822F, -0.6805F, -0.4278F, 0.8658F, 0.6245F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1704F, 2.1778F, -0.1007F, 0.0538F, -0.0687F, -1.8432F));
		PartDefinition bone25_r5 = bone25.addOrReplaceChild("bone25_r5", CubeListBuilder.create().texOffs(8, 259).addBox(-0.2226F, -1.0893F, -0.5375F, 1.0998F, 1.596F, 0.7267F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4136F, 0.8053F, 0.0485F, 0.082F, 0.0298F, -3.0531F));
		PartDefinition bone25_r6 = bone25.addOrReplaceChild("bone25_r6", CubeListBuilder.create().texOffs(42, 255).addBox(-1.0469F, -0.6805F, -0.4277F, 1.5131F, 1.289F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.221F, 1.9979F, -0.0845F, 0.047F, -0.0736F, -1.7471F));
		PartDefinition bone25_r7 = bone25.addOrReplaceChild("bone25_r7", CubeListBuilder.create().texOffs(64, 248).addBox(-0.7262F, -0.5045F, -0.4919F, 1.8844F, 1.0452F, 0.7293F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3648F, 1.3466F, -0.027F, 0.0F, -0.0873F, -1.1781F));
		PartDefinition bone50 = bone25.addOrReplaceChild("bone50", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.076F, 0.436F, 0.0603F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone50_r1 = bone50.addOrReplaceChild("bone50_r1", CubeListBuilder.create().texOffs(73, 241).addBox(-1.4861F, -0.8482F, -0.4203F, 2.748F, 1.7056F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0404F, -0.0774F, -0.6966F));
		PartDefinition bone50_r2 = bone50.addOrReplaceChild("bone50_r2", CubeListBuilder.create().texOffs(76, 261).addBox(-0.538F, -0.1488F, -0.3326F, 1.252F, 0.4736F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.874F, 1.8836F, -0.2696F, 0.0144F, -0.0861F, -1.3445F));
		PartDefinition bone50_r3 = bone50.addOrReplaceChild("bone50_r3", CubeListBuilder.create().texOffs(28, 263).addBox(-0.406F, -0.1048F, -0.3326F, 1.34F, 0.2096F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9125F, 3.2955F, -0.385F, 0.0204F, -0.0848F, -1.4146F));
		PartDefinition bone50_r4 = bone50.addOrReplaceChild("bone50_r4", CubeListBuilder.create().texOffs(50, 271).addBox(-2.284F, -0.4488F, -0.3326F, 2.042F, 0.5976F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.985F, 2.0344F, -0.2855F, 0.0321F, -0.0812F, -1.5546F));
		PartDefinition bone51 = bone25.addOrReplaceChild("bone51", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.076F, 0.436F, 0.0603F, 0.0F, 0.0F, 0.1047F));
		PartDefinition bone51_r1 = bone51.addOrReplaceChild("bone51_r1", CubeListBuilder.create().texOffs(60, 259).addBox(-0.3993F, -0.1518F, -0.3326F, 1.164F, 0.9736F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0901F, 1.932F, -0.2807F, -0.0053F, -0.0871F, -1.1168F));
		PartDefinition bone51_r2 = bone51.addOrReplaceChild("bone51_r2", CubeListBuilder.create().texOffs(2, 255).addBox(-2.18F, -0.0608F, -0.3326F, 1.926F, 0.5976F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1023F, 2.0353F, -0.2895F, 0.0122F, -0.0864F, -1.3182F));
		PartDefinition bone51_r3 = bone51.addOrReplaceChild("bone51_r3", CubeListBuilder.create().texOffs(56, 255).addBox(-2.31F, -0.2912F, -0.3326F, 1.968F, 0.352F, 0.6652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0555F, 1.9382F, -0.2801F, 0.0189F, -0.0852F, -1.3971F));
		PartDefinition bone3 = hair.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.3057F, 80.0583F, 0.0F));
		PartDefinition bone3_r1 = bone3.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(56, 233).addBox(-0.8502F, -0.8444F, -0.4298F, 1.7005F, 1.9442F, 1.0977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3531F, -31.2601F, 3.3161F, 0.3124F, 0.2079F, 1.201F));
		PartDefinition bone3_r2 = bone3.addOrReplaceChild("bone3_r2", CubeListBuilder.create().texOffs(62, 233).addBox(-0.8502F, -0.8444F, -1.1445F, 1.7005F, 1.9442F, 1.0977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4354F, -31.3022F, 3.136F, 0.3054F, 0.0F, 1.1345F));
		PartDefinition bone3_r3 = bone3.addOrReplaceChild("bone3_r3", CubeListBuilder.create().texOffs(68, 51).addBox(-0.5307F, -0.0731F, -1.1698F, 1.7005F, 2.1996F, 7.0542F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9057F, -31.9017F, -3.5093F, 0.0F, 0.0F, 1.1345F));
		PartDefinition bone3_r4 = bone3.addOrReplaceChild("bone3_r4", CubeListBuilder.create().texOffs(68, 233).addBox(-0.8502F, -0.8444F, -0.4298F, 1.7005F, 1.9442F, 1.0977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6302F, -31.2601F, 3.3161F, 0.3124F, -0.2079F, -1.201F));
		PartDefinition bone3_r5 = bone3.addOrReplaceChild("bone3_r5", CubeListBuilder.create().texOffs(74, 233).addBox(-0.8502F, -0.8444F, -1.1445F, 1.7005F, 1.9442F, 1.0977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7124F, -31.3022F, 3.136F, 0.3054F, 0.0F, -1.1345F));
		PartDefinition bone3_r6 = bone3.addOrReplaceChild("bone3_r6", CubeListBuilder.create().texOffs(86, 51).addBox(-1.1698F, -0.0731F, -1.1698F, 1.7005F, 2.1996F, 7.0542F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1827F, -31.9017F, -3.5093F, 0.0F, 0.0F, -1.1345F));
		PartDefinition bone102 = bone3.addOrReplaceChild("bone102", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0508F, -28.4634F, -4.5724F, 0.0F, 0.0F, 0.0349F));
		PartDefinition bone102_r1 = bone102.addOrReplaceChild("bone102_r1", CubeListBuilder.create().texOffs(38, 233).addBox(-0.266F, 0.1575F, -0.4789F, 0.8665F, 1.5771F, 1.7938F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3715F, 5.4633F, -0.0071F, -0.1203F, -0.0212F, -0.2169F));
		PartDefinition bone102_r2 = bone102.addOrReplaceChild("bone102_r2", CubeListBuilder.create().texOffs(38, 255).addBox(-0.266F, 0.0739F, -1.0641F, 0.8665F, 2.9807F, 0.5399F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3928F, 5.373F, 0.0591F, 0.0542F, -0.0212F, -0.2169F));
		PartDefinition bone102_r3 = bone102.addOrReplaceChild("bone102_r3", CubeListBuilder.create().texOffs(10, 237).addBox(-0.6004F, 1.9659F, -0.0697F, 1.0249F, 2.2239F, 1.3846F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2204F, 5.0551F, 0.0398F, -0.1222F, 0.0F, -0.0436F));
		PartDefinition bone102_r4 = bone102.addOrReplaceChild("bone102_r4", CubeListBuilder.create().texOffs(14, 178).addBox(-0.1604F, -1.6817F, -0.9805F, 1.3769F, 3.0291F, 2.2955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4952F, 4.33F, 0.1326F, -0.1222F, 0.0F, -0.0436F));
		PartDefinition bone102_r5 = bone102.addOrReplaceChild("bone102_r5", CubeListBuilder.create().texOffs(70, 162).addBox(-0.6004F, -0.9667F, -1.2753F, 1.3769F, 3.7815F, 2.1987F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0186F, -0.06F, 0.6397F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone103 = bone102.addOrReplaceChild("bone103", CubeListBuilder.create(), PartPose.offset(-0.052F, 12.2134F, -0.235F));
		PartDefinition bone103_r1 = bone103.addOrReplaceChild("bone103_r1", CubeListBuilder.create().texOffs(38, 263).addBox(-0.5212F, -0.5663F, -0.2699F, 0.8665F, 1.4847F, 0.5399F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7438F, -4.1735F, -0.3564F, 0.0521F, -0.0258F, 0.4811F));
		PartDefinition bone103_r2 = bone103.addOrReplaceChild("bone103_r2", CubeListBuilder.create().texOffs(10, 246).addBox(-0.3452F, -0.5685F, -0.8089F, 0.6905F, 1.1371F, 1.6178F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7493F, -4.0764F, 0.3698F, -0.1217F, -0.0106F, 0.4806F));
		PartDefinition bone103_r3 = bone103.addOrReplaceChild("bone103_r3", CubeListBuilder.create().texOffs(32, 233).addBox(0.526F, 0.0695F, -0.4789F, 0.5145F, 2.2811F, 1.7938F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2195F, -6.5291F, 0.2003F, -0.1203F, -0.0212F, -0.2169F));
		PartDefinition bone103_r4 = bone103.addOrReplaceChild("bone103_r4", CubeListBuilder.create().texOffs(52, 259).addBox(0.35F, -0.0142F, -1.0641F, 0.6905F, 2.3647F, 0.5399F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2408F, -6.6194F, 0.2665F, 0.0542F, -0.0212F, -0.2169F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7738F, -28.4634F, -4.5724F, 0.0F, 0.0F, -0.0349F));
		PartDefinition bone103_r5 = bone4.addOrReplaceChild("bone103_r5", CubeListBuilder.create().texOffs(38, 233).mirror().addBox(-0.6004F, 0.1575F, -0.4789F, 0.8665F, 1.5771F, 1.7938F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3715F, 5.4633F, -0.0071F, -0.1203F, 0.0212F, 0.2169F));
		PartDefinition bone103_r6 = bone4.addOrReplaceChild("bone103_r6", CubeListBuilder.create().texOffs(38, 255).mirror().addBox(-0.6004F, 0.0739F, -1.0641F, 0.8665F, 2.9807F, 0.5399F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3928F, 5.373F, 0.0591F, 0.0542F, 0.0212F, 0.2169F));
		PartDefinition bone103_r7 = bone4.addOrReplaceChild("bone103_r7", CubeListBuilder.create().texOffs(10, 237).mirror().addBox(-0.4245F, 1.9659F, -0.0697F, 1.0249F, 2.2239F, 1.3846F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2204F, 5.0551F, 0.0398F, -0.1222F, 0.0F, 0.0436F));
		PartDefinition bone103_r8 = bone4.addOrReplaceChild("bone103_r8", CubeListBuilder.create().texOffs(14, 178).mirror().addBox(-1.2164F, -1.6817F, -0.9805F, 1.3769F, 3.0291F, 2.2955F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4952F, 4.33F, 0.1326F, -0.1222F, 0.0F, 0.0436F));
		PartDefinition bone103_r9 = bone4.addOrReplaceChild("bone103_r9", CubeListBuilder.create().texOffs(70, 162).mirror().addBox(-0.7764F, -0.9667F, -1.2753F, 1.3769F, 3.7815F, 2.1987F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0186F, -0.06F, 0.6397F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.052F, 12.2134F, -0.235F));
		PartDefinition bone104_r1 = bone9.addOrReplaceChild("bone104_r1", CubeListBuilder.create().texOffs(38, 263).mirror().addBox(-0.3452F, -0.5663F, -0.2699F, 0.8665F, 1.4847F, 0.5399F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7438F, -4.1735F, -0.3564F, 0.0521F, 0.0258F, -0.4811F));
		PartDefinition bone104_r2 = bone9.addOrReplaceChild("bone104_r2", CubeListBuilder.create().texOffs(10, 246).mirror().addBox(-0.3452F, -0.5685F, -0.8089F, 0.6905F, 1.1371F, 1.6178F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7493F, -4.0764F, 0.3698F, -0.1217F, 0.0106F, -0.4806F));
		PartDefinition bone104_r3 = bone9.addOrReplaceChild("bone104_r3", CubeListBuilder.create().texOffs(32, 233).mirror().addBox(-1.0404F, 0.0695F, -0.4789F, 0.5145F, 2.2811F, 1.7938F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2195F, -6.5291F, 0.2003F, -0.1203F, 0.0212F, 0.2169F));
		PartDefinition bone104_r4 = bone9.addOrReplaceChild("bone104_r4", CubeListBuilder.create().texOffs(52, 259).mirror().addBox(-1.0404F, -0.0142F, -1.0641F, 0.6905F, 2.3647F, 0.5399F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2408F, -6.6194F, 0.2665F, 0.0542F, 0.0212F, 0.2169F));
		PartDefinition bone7 = hair.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.3057F, 80.0583F, 1.7546F));
		PartDefinition bone7_r1 = bone7.addOrReplaceChild("bone7_r1", CubeListBuilder.create().texOffs(0, 203).addBox(-0.769F, -0.8268F, -1.1292F, 1.0614F, 1.0977F, 2.6834F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2018F, -23.4773F, -2.5161F, 0.1715F, 0.0283F, -0.26F));
		PartDefinition bone7_r2 = bone7.addOrReplaceChild("bone7_r2", CubeListBuilder.create().texOffs(72, 173).addBox(-0.6894F, -1.4622F, -1.316F, 0.982F, 2.2096F, 2.8702F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9667F, -24.3259F, -2.8387F, 0.5642F, 0.0283F, -0.26F));
		PartDefinition bone7_r3 = bone7.addOrReplaceChild("bone7_r3", CubeListBuilder.create().texOffs(8, 158).addBox(-1.0866F, -1.7546F, -1.7546F, 1.3791F, 2.9244F, 2.632F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4659F, -26.1751F, -3.1413F, 0.1278F, 0.0283F, -0.26F));
		PartDefinition bone7_r4 = bone7.addOrReplaceChild("bone7_r4", CubeListBuilder.create().texOffs(30, 123).addBox(-0.2924F, -2.3395F, -2.7962F, 0.5849F, 3.5093F, 3.6735F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9715F, -28.9516F, -3.5093F, 0.1309F, 0.0F, -0.0436F));
		PartDefinition bone13 = bone7.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8171F, -29.8702F, -2.3054F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1", CubeListBuilder.create().texOffs(44, 131).addBox(-0.5849F, -5.2639F, -0.8773F, 0.8773F, 7.5708F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8342F, 3.7612F, 0.6468F, 0.1304F, 0.0114F, -0.1302F));
		PartDefinition bone29 = bone13.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3014F, 2.9884F, 0.6798F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone29_r1 = bone29.addOrReplaceChild("bone29_r1", CubeListBuilder.create().texOffs(70, 123).addBox(-0.2924F, 1.655F, -0.8773F, 0.5849F, 1.7707F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1074F, 0.0749F, -0.6505F));
		PartDefinition bone29_r2 = bone29.addOrReplaceChild("bone29_r2", CubeListBuilder.create().texOffs(10, 114).addBox(-0.6895F, 5.14F, -0.8773F, 0.982F, 2.5429F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1191F, -1.978F, -0.2608F, 0.121F, 0.05F, -0.4333F));
		PartDefinition bone29_r3 = bone29.addOrReplaceChild("bone29_r3", CubeListBuilder.create().texOffs(50, 123).addBox(-0.6895F, -2.724F, -0.8773F, 0.982F, 1.195F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0906F, 7.0131F, 0.6497F, 0.0F, 0.05F, -0.4333F));
		PartDefinition bone29_r4 = bone29.addOrReplaceChild("bone29_r4", CubeListBuilder.create().texOffs(83, 138).addBox(-0.6895F, 0.6485F, -0.8773F, 0.982F, 1.9961F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3624F, 4.868F, 0.6408F, 0.0129F, 0.0483F, -0.0839F));
		PartDefinition bone29_r5 = bone29.addOrReplaceChild("bone29_r5", CubeListBuilder.create().texOffs(46, 251).addBox(-0.6895F, -0.6969F, 1.1624F, 0.982F, 2.4334F, 0.7582F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6678F, 9.1756F, -0.5358F, -0.5543F, 0.0483F, -0.0839F));
		PartDefinition bone29_r6 = bone29.addOrReplaceChild("bone29_r6", CubeListBuilder.create().texOffs(62, 263).addBox(-0.6895F, -0.8558F, -0.1878F, 0.982F, 2.1951F, 0.9964F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.747F, 9.9489F, -0.2436F, -0.2489F, 0.0483F, -0.0839F));
		PartDefinition bone29_r7 = bone29.addOrReplaceChild("bone29_r7", CubeListBuilder.create().texOffs(24, 251).addBox(-0.6895F, -2.2853F, -0.1878F, 0.982F, 1.798F, 0.9964F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7356F, 9.7202F, -0.0814F, -0.0307F, 0.0483F, -0.0839F));
		PartDefinition bone29_r8 = bone29.addOrReplaceChild("bone29_r8", CubeListBuilder.create().texOffs(28, 237).addBox(-0.6895F, -2.2059F, 0.6064F, 0.982F, 2.4334F, 1.3141F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.649F, 8.8226F, -0.3096F, -0.2925F, 0.0483F, -0.0839F));
		PartDefinition bone29_r9 = bone29.addOrReplaceChild("bone29_r9", CubeListBuilder.create().texOffs(72, 261).addBox(-0.4764F, 0.4168F, 0.2616F, 0.9527F, 1.3108F, 0.668F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7041F, 9.9135F, 2.7445F, -0.5107F, 0.0483F, -0.0839F));
		PartDefinition bone29_r10 = bone29.addOrReplaceChild("bone29_r10", CubeListBuilder.create().texOffs(82, 246).addBox(-0.4764F, -1.0922F, -0.6914F, 0.9527F, 2.105F, 0.9857F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7428F, 10.5747F, 2.3961F, -0.118F, 0.0483F, -0.0839F));
		PartDefinition bone29_r11 = bone29.addOrReplaceChild("bone29_r11", CubeListBuilder.create().texOffs(4, 259).addBox(-0.4764F, -1.0922F, -0.056F, 0.9527F, 1.1519F, 0.9857F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7326F, 10.4056F, 2.4792F, -0.2925F, 0.0483F, -0.0839F));
		PartDefinition bone29_r12 = bone29.addOrReplaceChild("bone29_r12", CubeListBuilder.create().texOffs(22, 224).addBox(-0.4764F, -1.0922F, -0.9297F, 0.9527F, 2.1844F, 1.8593F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.587F, 8.4391F, 2.8892F, -0.118F, 0.0483F, -0.0839F));
		PartDefinition bone20 = bone13.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0367F, 7.3111F, 0.9012F, -0.1298F, -0.017F, -0.1298F));
		PartDefinition bone20_r1 = bone20.addOrReplaceChild("bone20_r1", CubeListBuilder.create().texOffs(20, 246).addBox(-0.491F, -2.8829F, -0.4593F, 0.982F, 3.5378F, 0.6177F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1309F, -0.7257F, -1.6187F, 0.3659F, 0.0795F, -0.694F));
		PartDefinition bone20_r2 = bone20.addOrReplaceChild("bone20_r2", CubeListBuilder.create().texOffs(16, 233).addBox(-0.491F, -1.215F, -0.5596F, 0.982F, 2.4301F, 1.437F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5929F, -7.0989F, -1.6407F, 0.0607F, 0.116F, -1.1309F));
		PartDefinition bone20_r3 = bone20.addOrReplaceChild("bone20_r3", CubeListBuilder.create().texOffs(34, 224).addBox(-0.6895F, 0.1699F, -0.8773F, 0.982F, 2.4259F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1344F, -2.2961F, -1.1934F, 0.1041F, 0.0795F, -0.694F));
		PartDefinition bone20_r4 = bone20.addOrReplaceChild("bone20_r4", CubeListBuilder.create().texOffs(102, 229).addBox(-0.6895F, 2.632F, -0.8773F, 0.982F, 1.6275F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.619F, -2.7536F, -1.2506F, 0.121F, 0.05F, -0.4333F));
		PartDefinition bone20_r5 = bone20.addOrReplaceChild("bone20_r5", CubeListBuilder.create().texOffs(58, 237).addBox(-0.6895F, -2.4857F, -0.8773F, 0.982F, 0.8773F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1785F, 3.2331F, -0.7434F, 0.0F, 0.05F, -0.4333F));
		PartDefinition bone20_r6 = bone20.addOrReplaceChild("bone20_r6", CubeListBuilder.create().texOffs(52, 229).addBox(-0.6895F, -1.0235F, -0.8773F, 0.982F, 1.8373F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5204F, 2.6904F, -0.7307F, 0.0129F, 0.0483F, -0.0403F));
		PartDefinition bone20_r7 = bone20.addOrReplaceChild("bone20_r7", CubeListBuilder.create().texOffs(38, 251).addBox(-0.6895F, -2.2059F, -0.5849F, 0.982F, 2.076F, 0.8773F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6129F, 5.6158F, -1.2568F, -0.118F, 0.0483F, -0.0403F));
		PartDefinition bone20_r8 = bone20.addOrReplaceChild("bone20_r8", CubeListBuilder.create().texOffs(96, 233).addBox(-0.6886F, -1.7546F, -0.5849F, 0.9527F, 2.2972F, 1.4622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6226F, 4.975F, -1.1263F, -0.2489F, 0.0483F, -0.0403F));
		PartDefinition bone11 = hair.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-0.0287F, 80.0583F, 1.7546F));
		PartDefinition bone11_r1 = bone11.addOrReplaceChild("bone11_r1", CubeListBuilder.create().texOffs(52, 195).addBox(-0.2924F, -0.8268F, -1.1292F, 1.0614F, 1.0977F, 2.6834F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2018F, -23.4773F, -2.5161F, 0.1715F, -0.0283F, 0.26F));
		PartDefinition bone11_r2 = bone11.addOrReplaceChild("bone11_r2", CubeListBuilder.create().texOffs(72, 168).addBox(-0.2925F, -1.4622F, -1.316F, 0.982F, 2.2096F, 2.8702F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9667F, -24.3259F, -2.8387F, 0.5642F, -0.0283F, 0.26F));
		PartDefinition bone11_r3 = bone11.addOrReplaceChild("bone11_r3", CubeListBuilder.create().texOffs(0, 158).addBox(-0.2924F, -1.7546F, -1.7546F, 1.3791F, 2.9244F, 2.632F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4659F, -26.1751F, -3.1413F, 0.1278F, -0.0283F, 0.26F));
		PartDefinition bone11_r4 = bone11.addOrReplaceChild("bone11_r4", CubeListBuilder.create().texOffs(61, 140).addBox(-0.2924F, -2.3395F, -2.7962F, 0.5849F, 3.5093F, 3.6735F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9715F, -28.9516F, -3.5093F, 0.1309F, 0.0F, 0.0436F));
		PartDefinition bone15 = bone11.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8171F, -29.8702F, -2.3054F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone15_r1 = bone15.addOrReplaceChild("bone15_r1", CubeListBuilder.create().texOffs(38, 131).addBox(-0.2924F, -5.2639F, -0.8773F, 0.8773F, 7.5708F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8342F, 3.7612F, 0.6468F, 0.1304F, -0.0114F, 0.1302F));
		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3014F, 2.9884F, 0.6798F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone17_r1 = bone17.addOrReplaceChild("bone17_r1", CubeListBuilder.create().texOffs(60, 123).addBox(-0.2924F, 1.655F, -0.8773F, 0.5849F, 1.7707F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1074F, -0.0749F, 0.6505F));
		PartDefinition bone17_r2 = bone17.addOrReplaceChild("bone17_r2", CubeListBuilder.create().texOffs(0, 114).addBox(-0.2924F, 5.14F, -0.8773F, 0.982F, 2.5429F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1191F, -1.978F, -0.2608F, 0.121F, -0.05F, 0.4333F));
		PartDefinition bone17_r3 = bone17.addOrReplaceChild("bone17_r3", CubeListBuilder.create().texOffs(40, 123).addBox(-0.2924F, -2.724F, -0.8773F, 0.982F, 1.195F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0906F, 7.0131F, 0.6497F, 0.0F, -0.05F, 0.4333F));
		PartDefinition bone17_r4 = bone17.addOrReplaceChild("bone17_r4", CubeListBuilder.create().texOffs(66, 114).addBox(-0.2924F, 0.6485F, -0.8773F, 0.982F, 1.9961F, 4.1372F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3624F, 4.868F, 0.6408F, 0.0129F, -0.0483F, 0.0839F));
		PartDefinition bone17_r5 = bone17.addOrReplaceChild("bone17_r5", CubeListBuilder.create().texOffs(42, 251).addBox(-0.2924F, -0.6969F, 1.1624F, 0.982F, 2.4334F, 0.7582F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6678F, 9.1756F, -0.5358F, -0.5543F, -0.0483F, 0.0839F));
		PartDefinition bone17_r6 = bone17.addOrReplaceChild("bone17_r6", CubeListBuilder.create().texOffs(48, 246).addBox(-0.2924F, -0.8558F, -0.1878F, 0.982F, 2.1951F, 0.9964F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.747F, 9.9489F, -0.2436F, -0.2489F, -0.0483F, 0.0839F));
		PartDefinition bone17_r7 = bone17.addOrReplaceChild("bone17_r7", CubeListBuilder.create().texOffs(20, 251).addBox(-0.2924F, -2.2853F, -0.1878F, 0.982F, 1.798F, 0.9964F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7356F, 9.7202F, -0.0814F, -0.0307F, -0.0483F, 0.0839F));
		PartDefinition bone17_r8 = bone17.addOrReplaceChild("bone17_r8", CubeListBuilder.create().texOffs(81, 239).addBox(-0.2924F, -2.2059F, 0.6064F, 0.982F, 2.4334F, 1.3141F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.649F, 8.8226F, -0.3096F, -0.2925F, -0.0483F, 0.0839F));
		PartDefinition bone17_r9 = bone17.addOrReplaceChild("bone17_r9", CubeListBuilder.create().texOffs(72, 259).addBox(-0.4764F, 0.4168F, 0.2616F, 0.9527F, 1.3108F, 0.668F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7041F, 9.9135F, 2.7445F, -0.5107F, -0.0483F, 0.0839F));
		PartDefinition bone17_r10 = bone17.addOrReplaceChild("bone17_r10", CubeListBuilder.create().texOffs(78, 246).addBox(-0.4764F, -1.0922F, -0.6914F, 0.9527F, 2.105F, 0.9857F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7428F, 10.5747F, 2.3961F, -0.118F, -0.0483F, 0.0839F));
		PartDefinition bone17_r11 = bone17.addOrReplaceChild("bone17_r11", CubeListBuilder.create().texOffs(8, 272).addBox(-0.4764F, -1.0922F, -0.056F, 0.9527F, 1.1519F, 0.9857F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7326F, 10.4056F, 2.4792F, -0.2925F, -0.0483F, 0.0839F));
		PartDefinition bone17_r12 = bone17.addOrReplaceChild("bone17_r12", CubeListBuilder.create().texOffs(16, 224).addBox(-0.4764F, -1.0922F, -0.9297F, 0.9527F, 2.1844F, 1.8593F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.587F, 8.4391F, 2.8892F, -0.118F, -0.0483F, 0.0839F));
		PartDefinition bone19 = bone15.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0367F, 7.3111F, 0.9012F, -0.1298F, 0.017F, 0.1298F));
		PartDefinition bone19_r1 = bone19.addOrReplaceChild("bone19_r1", CubeListBuilder.create().texOffs(16, 246).addBox(-0.491F, -2.8829F, -0.4593F, 0.982F, 3.5378F, 0.6177F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1309F, -0.7257F, -1.6187F, 0.3659F, -0.0795F, 0.694F));
		PartDefinition bone19_r2 = bone19.addOrReplaceChild("bone19_r2", CubeListBuilder.create().texOffs(12, 233).addBox(-0.491F, -1.215F, -0.5596F, 0.982F, 2.4301F, 1.437F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5929F, -7.0989F, -1.6407F, 0.0607F, -0.116F, 1.1309F));
		PartDefinition bone19_r3 = bone19.addOrReplaceChild("bone19_r3", CubeListBuilder.create().texOffs(28, 224).addBox(-0.2924F, 0.1699F, -0.8773F, 0.982F, 2.4259F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1344F, -2.2961F, -1.1934F, 0.1041F, -0.0795F, 0.694F));
		PartDefinition bone19_r4 = bone19.addOrReplaceChild("bone19_r4", CubeListBuilder.create().texOffs(96, 229).addBox(-0.2924F, 2.632F, -0.8773F, 0.982F, 1.6275F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.619F, -2.7536F, -1.2506F, 0.121F, -0.05F, 0.4333F));
		PartDefinition bone19_r5 = bone19.addOrReplaceChild("bone19_r5", CubeListBuilder.create().texOffs(52, 237).addBox(-0.2924F, -2.4857F, -0.8773F, 0.982F, 0.8773F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1785F, 3.2331F, -0.7434F, 0.0F, -0.05F, 0.4333F));
		PartDefinition bone19_r6 = bone19.addOrReplaceChild("bone19_r6", CubeListBuilder.create().texOffs(46, 229).addBox(-0.2924F, -1.0235F, -0.8773F, 0.982F, 1.8373F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5204F, 2.6904F, -0.7307F, 0.0129F, -0.0483F, 0.0403F));
		PartDefinition bone19_r7 = bone19.addOrReplaceChild("bone19_r7", CubeListBuilder.create().texOffs(34, 251).addBox(-0.2924F, -2.2059F, -0.5849F, 0.982F, 2.076F, 0.8773F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6129F, 5.6158F, -1.2568F, -0.118F, -0.0483F, 0.0403F));
		PartDefinition bone19_r8 = bone19.addOrReplaceChild("bone19_r8", CubeListBuilder.create().texOffs(92, 233).addBox(-0.2633F, -1.7546F, -0.5849F, 0.9527F, 2.2972F, 1.4622F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6226F, 4.975F, -1.1263F, -0.2489F, -0.0483F, 0.0403F));
		PartDefinition bone27 = hair.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1982F, 52.0939F, 3.419F, 0.0F, 0.5672F, 0.0F));
		PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8951F, 4.1453F, 1.0831F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bone28_r1 = bone28.addOrReplaceChild("bone28_r1", CubeListBuilder.create().texOffs(52, 72).addBox(-0.8735F, -3.2365F, -3.3935F, 1.2307F, 8.6968F, 3.1337F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8378F, -3.9153F, -2.4081F, 0.5251F, -0.6745F, -0.2252F));
		PartDefinition bone30 = bone28.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8869F, -3.9965F, -2.0853F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone30_r1 = bone30.addOrReplaceChild("bone30_r1", CubeListBuilder.create().texOffs(107, 84).addBox(-0.8735F, -3.4125F, -1.1698F, 2.144F, 7.8404F, 2.3395F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4026F, 0.0363F, 0.1374F));
		PartDefinition bone30_r2 = bone30.addOrReplaceChild("bone30_r2", CubeListBuilder.create().texOffs(72, 187).addBox(0.0562F, -5.2899F, 0.1205F, 1.1513F, 3.9651F, 2.1807F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6344F, 7.0468F, 2.0515F, 0.377F, -0.1492F, 0.5815F));
		PartDefinition bone30_r3 = bone30.addOrReplaceChild("bone30_r3", CubeListBuilder.create().texOffs(66, 208).addBox(0.1393F, 1.9037F, -2.0727F, 1.1513F, 1.2524F, 2.1807F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4775F, 3.5015F, 2.8437F, 0.4029F, -0.0323F, 0.167F));
		PartDefinition bone30_r4 = bone30.addOrReplaceChild("bone30_r4", CubeListBuilder.create().texOffs(62, 229).addBox(0.11F, -1.4677F, 0.1596F, 1.1805F, 3.4009F, 1.0903F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0002F, 12.243F, 5.2394F, 1.0137F, -0.0323F, 0.167F));
		PartDefinition bone30_r5 = bone30.addOrReplaceChild("bone30_r5", CubeListBuilder.create().texOffs(12, 224).addBox(0.11F, -1.4677F, 1.5891F, 1.1805F, 3.1627F, 1.408F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0578F, 12.6717F, 4.7902F, 0.752F, -0.0323F, 0.167F));
		PartDefinition bone30_r6 = bone30.addOrReplaceChild("bone30_r6", CubeListBuilder.create().texOffs(24, 168).addBox(0.11F, -3.215F, 0.3978F, 1.1805F, 2.7656F, 2.5993F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9076F, 11.9364F, 3.9906F, 0.5774F, -0.0323F, 0.167F));
		PartDefinition bone30_r7 = bone30.addOrReplaceChild("bone30_r7", CubeListBuilder.create().texOffs(58, 199).addBox(0.1393F, -1.5229F, 1.2777F, 1.1513F, 1.9038F, 2.3611F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3775F, 9.1102F, 1.4507F, 0.4029F, -0.0323F, 0.167F));
		PartDefinition bone32 = bone27.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6389F, 10.609F, -2.9399F, -0.2182F, 0.0F, 0.0F));
		PartDefinition bone33 = bone27.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3842F, -1.6624F, 1.7528F, -0.0755F, 0.2653F, 0.045F));
		PartDefinition bone33_r1 = bone33.addOrReplaceChild("bone33_r1", CubeListBuilder.create().texOffs(40, 212).addBox(-0.2924F, -2.2456F, -2.3321F, 0.5849F, 2.9099F, 2.148F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9616F, 11.4798F, 0.9986F, 0.2311F, -0.0483F, 0.1712F));
		PartDefinition bone33_r2 = bone33.addOrReplaceChild("bone33_r2", CubeListBuilder.create().texOffs(74, 246).addBox(-0.2632F, 0.953F, -0.3466F, 0.5556F, 1.8125F, 1.3579F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1921F, 12.6815F, 1.4628F, 0.4493F, -0.0483F, 0.1712F));
		PartDefinition bone33_r3 = bone33.addOrReplaceChild("bone33_r3", CubeListBuilder.create().texOffs(14, 217).addBox(-0.2632F, 0.953F, -2.7292F, 0.5556F, 2.1302F, 2.3611F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1361F, 12.4381F, 1.1789F, 0.5802F, -0.0483F, 0.1712F));
		PartDefinition bone33_r4 = bone33.addOrReplaceChild("bone33_r4", CubeListBuilder.create().texOffs(80, 131).addBox(-0.2632F, -0.3177F, -2.7292F, 0.5556F, 2.1302F, 3.7405F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0425F, 11.9217F, 1.0899F, 0.4493F, -0.0483F, 0.1712F));
		PartDefinition bone33_r5 = bone33.addOrReplaceChild("bone33_r5", CubeListBuilder.create().texOffs(66, 202).addBox(-0.2632F, -2.2059F, -0.7942F, 0.5556F, 3.484F, 1.939F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0437F, 11.6801F, 1.3609F, 0.1002F, -0.0483F, 0.1712F));
		PartDefinition bone33_r6 = bone33.addOrReplaceChild("bone33_r6", CubeListBuilder.create().texOffs(71, 202).addBox(-0.2924F, 1.4845F, -1.6715F, 0.5849F, 1.0013F, 3.134F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2104F, 7.1895F, 0.8056F, 0.0129F, -0.0483F, 0.1712F));
		PartDefinition bone33_r7 = bone33.addOrReplaceChild("bone33_r7", CubeListBuilder.create().texOffs(60, 195).addBox(-0.2924F, -2.5693F, -1.6715F, 0.5849F, 0.9609F, 3.134F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1622F, 10.1846F, 0.8253F, 0.0F, -0.05F, 0.4333F));
		PartDefinition bone33_r8 = bone33.addOrReplaceChild("bone33_r8", CubeListBuilder.create().texOffs(32, 187).addBox(-0.2924F, 2.632F, -1.6715F, 0.5849F, 1.7111F, 2.9668F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3294F, 4.1227F, 0.308F, 0.121F, -0.05F, 0.4333F));
		PartDefinition bone33_r9 = bone33.addOrReplaceChild("bone33_r9", CubeListBuilder.create().texOffs(30, 114).addBox(-0.2924F, -5.2639F, -1.6715F, 1.5164F, 6.1412F, 2.5488F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6381F, 3.5179F, 0.2245F, 0.1308F, 0.0057F, 0.0004F));
		PartDefinition bone33_r10 = bone33.addOrReplaceChild("bone33_r10", CubeListBuilder.create().texOffs(12, 212).addBox(-0.2924F, 0.5849F, -1.2744F, 0.5849F, 2.9244F, 2.1517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3385F, 3.7817F, 0.2575F, 0.1074F, -0.0749F, 0.6505F));
		PartDefinition bone18 = hair.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8638F, 52.0939F, 3.419F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone21 = bone18.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8951F, 4.1453F, 1.0831F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bone21_r1 = bone21.addOrReplaceChild("bone21_r1", CubeListBuilder.create().texOffs(44, 72).addBox(-0.3572F, -3.2365F, -3.3935F, 1.2307F, 8.6968F, 3.1337F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8378F, -3.9153F, -2.4081F, 0.5251F, 0.6745F, 0.2252F));
		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8869F, -3.9965F, -2.0853F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone22_r1 = bone22.addOrReplaceChild("bone22_r1", CubeListBuilder.create().texOffs(70, 84).addBox(-1.2706F, -3.4125F, -1.1698F, 2.144F, 7.8404F, 2.3395F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4026F, -0.0363F, -0.1374F));
		PartDefinition bone22_r2 = bone22.addOrReplaceChild("bone22_r2", CubeListBuilder.create().texOffs(44, 168).addBox(-1.2075F, -5.2899F, 0.1205F, 1.1513F, 3.9651F, 2.1807F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6344F, 7.0468F, 2.0515F, 0.377F, 0.1492F, -0.5815F));
		PartDefinition bone22_r3 = bone22.addOrReplaceChild("bone22_r3", CubeListBuilder.create().texOffs(54, 217).addBox(-1.2906F, 1.9037F, -2.0727F, 1.1513F, 1.2524F, 2.1807F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4775F, 3.5015F, 2.8437F, 0.4029F, 0.0323F, -0.167F));
		PartDefinition bone22_r4 = bone22.addOrReplaceChild("bone22_r4", CubeListBuilder.create().texOffs(58, 229).addBox(-1.2906F, -1.4677F, 0.1596F, 1.1805F, 3.4009F, 1.0903F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0002F, 12.243F, 5.2394F, 1.0137F, 0.0323F, -0.167F));
		PartDefinition bone22_r5 = bone22.addOrReplaceChild("bone22_r5", CubeListBuilder.create().texOffs(8, 224).addBox(-1.2906F, -1.4677F, 1.5891F, 1.1805F, 3.1627F, 1.408F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0578F, 12.6717F, 4.7902F, 0.752F, 0.0323F, -0.167F));
		PartDefinition bone22_r6 = bone22.addOrReplaceChild("bone22_r6", CubeListBuilder.create().texOffs(16, 168).addBox(-1.2906F, -3.215F, 0.3978F, 1.1805F, 2.7656F, 2.5993F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9076F, 11.9364F, 3.9906F, 0.5774F, 0.0323F, -0.167F));
		PartDefinition bone22_r7 = bone22.addOrReplaceChild("bone22_r7", CubeListBuilder.create().texOffs(46, 195).addBox(-1.2906F, -1.5229F, 1.2777F, 1.1513F, 1.9038F, 2.3611F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3775F, 9.1102F, 1.4507F, 0.4029F, 0.0323F, -0.167F));
		PartDefinition bone23 = bone18.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6389F, 10.609F, -2.9399F, -0.2182F, 0.0F, 0.0F));
		PartDefinition bone26 = bone18.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3842F, -1.6624F, 1.7528F, -0.0755F, -0.2653F, -0.045F));
		PartDefinition bone26_r1 = bone26.addOrReplaceChild("bone26_r1", CubeListBuilder.create().texOffs(34, 212).addBox(-0.2924F, -2.2456F, -2.3321F, 0.5849F, 2.9099F, 2.148F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9616F, 11.4798F, 0.9986F, 0.2311F, 0.0483F, -0.1712F));
		PartDefinition bone26_r2 = bone26.addOrReplaceChild("bone26_r2", CubeListBuilder.create().texOffs(70, 246).addBox(-0.2924F, 0.953F, -0.3466F, 0.5556F, 1.8125F, 1.3579F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1921F, 12.6815F, 1.4628F, 0.4493F, 0.0483F, -0.1712F));
		PartDefinition bone26_r3 = bone26.addOrReplaceChild("bone26_r3", CubeListBuilder.create().texOffs(8, 217).addBox(-0.2924F, 0.953F, -2.7292F, 0.5556F, 2.1302F, 2.3611F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1361F, 12.4381F, 1.1789F, 0.5802F, 0.0483F, -0.1712F));
		PartDefinition bone26_r4 = bone26.addOrReplaceChild("bone26_r4", CubeListBuilder.create().texOffs(70, 131).addBox(-0.2924F, -0.3177F, -2.7292F, 0.5556F, 2.1302F, 3.7405F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0425F, 11.9217F, 1.0899F, 0.4493F, 0.0483F, -0.1712F));
		PartDefinition bone26_r5 = bone26.addOrReplaceChild("bone26_r5", CubeListBuilder.create().texOffs(66, 212).addBox(-0.2924F, -2.2059F, -0.7942F, 0.5556F, 3.484F, 1.939F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0437F, 11.6801F, 1.3609F, 0.1002F, 0.0483F, -0.1712F));
		PartDefinition bone26_r6 = bone26.addOrReplaceChild("bone26_r6", CubeListBuilder.create().texOffs(4, 195).addBox(-0.2924F, 1.4845F, -1.6715F, 0.5849F, 1.0013F, 3.134F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2104F, 7.1895F, 0.8056F, 0.0129F, 0.0483F, -0.1712F));
		PartDefinition bone26_r7 = bone26.addOrReplaceChild("bone26_r7", CubeListBuilder.create().texOffs(73, 207).addBox(-0.2924F, -2.5693F, -1.6715F, 0.5849F, 0.9609F, 3.134F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1622F, 10.1846F, 0.8253F, 0.0F, 0.05F, -0.4333F));
		PartDefinition bone26_r8 = bone26.addOrReplaceChild("bone26_r8", CubeListBuilder.create().texOffs(24, 187).addBox(-0.2924F, 2.632F, -1.6715F, 0.5849F, 1.7111F, 2.9668F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3294F, 4.1227F, 0.308F, 0.121F, 0.05F, -0.4333F));
		PartDefinition bone26_r9 = bone26.addOrReplaceChild("bone26_r9", CubeListBuilder.create().texOffs(20, 114).addBox(-1.2239F, -5.2639F, -1.6715F, 1.5164F, 6.1412F, 2.5488F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6381F, 3.5179F, 0.2245F, 0.1308F, -0.0057F, -0.0004F));
		PartDefinition bone26_r10 = bone26.addOrReplaceChild("bone26_r10", CubeListBuilder.create().texOffs(44, 265).addBox(-0.2924F, 0.5849F, -1.2744F, 0.5849F, 2.9244F, 2.1517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3385F, 3.7817F, 0.2575F, 0.1074F, 0.0749F, -0.6505F));
		PartDefinition bone45 = hair.addOrReplaceChild("bone45", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8527F, 49.7112F, 4.8812F, -0.0873F, -1.3963F, 0.0F));
		PartDefinition bone49 = bone45.addOrReplaceChild("bone49", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7768F, 13.0507F, -1.3344F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone49_r1 = bone49.addOrReplaceChild("bone49_r1", CubeListBuilder.create().texOffs(80, 167).addBox(-0.2924F, -1.621F, -1.2618F, 1.1408F, 6.6571F, 1.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5988F, -11.9185F, 2.1248F, -0.0453F, 0.0359F, -0.217F));
		PartDefinition bone49_r2 = bone49.addOrReplaceChild("bone49_r2", CubeListBuilder.create().texOffs(20, 217).addBox(-0.2925F, -0.9063F, 0.4269F, 1.1408F, 5.9424F, 0.6802F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5854F, -11.8739F, 2.2242F, -0.1762F, 0.0359F, -0.217F));
		PartDefinition bone49_r3 = bone49.addOrReplaceChild("bone49_r3", CubeListBuilder.create().texOffs(46, 178).addBox(-0.2924F, -3.686F, -0.4387F, 0.5849F, 5.1482F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8773F, -7.5935F, 0.8878F, -0.1795F, -0.0106F, -0.4747F));
		PartDefinition bone49_r4 = bone49.addOrReplaceChild("bone49_r4", CubeListBuilder.create().texOffs(40, 237).addBox(-0.2924F, -0.262F, -1.0235F, 0.5849F, 0.9211F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1984F, -2.9238F, 0.5394F, -0.005F, -0.0106F, -0.4747F));
		PartDefinition bone49_r5 = bone49.addOrReplaceChild("bone49_r5", CubeListBuilder.create().texOffs(12, 229).addBox(-0.2924F, -0.9768F, -1.0235F, 0.5849F, 1.9535F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6777F, -3.8528F, 0.6987F, -0.1795F, -0.0106F, -0.4747F));
		PartDefinition bone49_r6 = bone49.addOrReplaceChild("bone49_r6", CubeListBuilder.create().texOffs(18, 229).addBox(-0.2924F, 1.0903F, -1.0235F, 0.5849F, 1.9535F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8148F, -7.1314F, 1.4008F, -0.1766F, -0.0339F, -0.6035F));
		PartDefinition bone49_r7 = bone49.addOrReplaceChild("bone49_r7", CubeListBuilder.create().texOffs(86, 233).addBox(-0.2924F, -1.316F, -1.0235F, 0.5849F, 1.2944F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8479F, -1.1327F, 0.5159F, -0.0102F, -0.0323F, -0.0798F));
		PartDefinition bone49_r8 = bone49.addOrReplaceChild("bone49_r8", CubeListBuilder.create().texOffs(87, 259).addBox(-0.2924F, -2.4525F, 0.4934F, 0.5849F, 2.8908F, 0.7016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4817F, 3.5034F, 0.6541F, 0.1643F, -0.0323F, -0.0798F));
		PartDefinition bone49_r9 = bone49.addOrReplaceChild("bone49_r9", CubeListBuilder.create().texOffs(50, 266).addBox(-0.2924F, -2.0471F, -0.2924F, 0.5849F, 3.2168F, 1.1698F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5225F, 2.9075F, 0.4421F, 0.2952F, -0.0323F, -0.0798F));
		PartDefinition bone49_r10 = bone49.addOrReplaceChild("bone49_r10", CubeListBuilder.create().texOffs(18, 265).addBox(-0.2924F, -2.0471F, 0.5522F, 0.5849F, 2.2132F, 0.3251F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6906F, 0.8637F, 0.5884F, -0.0364F, -0.0323F, -0.0798F));
		PartDefinition bone49_r11 = bone49.addOrReplaceChild("bone49_r11", CubeListBuilder.create().texOffs(50, 233).addBox(-0.2924F, -1.6084F, -0.1462F, 0.5849F, 2.2132F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6962F, 0.4308F, -0.307F, 0.0334F, -0.0323F, -0.0798F));
		PartDefinition bone24 = bone49.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8371F, -2.4199F, 2.5104F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone24_r1 = bone24.addOrReplaceChild("bone24_r1", CubeListBuilder.create().texOffs(44, 217).addBox(-0.2924F, -1.6084F, -0.6227F, 0.5849F, 2.255F, 2.2312F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3413F, 1.7743F, -0.7964F, 0.0334F, -0.0323F, -0.0798F));
		PartDefinition bone24_r2 = bone24.addOrReplaceChild("bone24_r2", CubeListBuilder.create().texOffs(22, 158).addBox(-0.2924F, -4.5256F, -1.2618F, 0.7437F, 5.1847F, 2.2853F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0075F, -1.1673F, 0.0439F, -0.005F, -0.0106F, -0.4747F));
		PartDefinition bone24_r3 = bone24.addOrReplaceChild("bone24_r3", CubeListBuilder.create().texOffs(72, 229).addBox(-0.2924F, 0.356F, -1.2618F, 0.5849F, 0.96F, 2.2853F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6F, -1.1224F, 0.0401F, -0.0102F, -0.0323F, -0.0798F));
		PartDefinition bone24_r4 = bone24.addOrReplaceChild("bone24_r4", CubeListBuilder.create().texOffs(72, 263).addBox(-0.2924F, -2.0471F, 0.5522F, 0.5849F, 4.0942F, 0.3251F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3357F, 2.2073F, 0.099F, -0.0364F, -0.0323F, -0.0798F));
		PartDefinition bone24_r5 = bone24.addOrReplaceChild("bone24_r5", CubeListBuilder.create().texOffs(88, 224).addBox(-0.2924F, -2.0471F, -0.5307F, 0.5849F, 3.2168F, 1.6463F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1605F, 4.2388F, -0.294F, 0.2952F, -0.0323F, -0.0798F));
		PartDefinition bone24_r6 = bone24.addOrReplaceChild("bone24_r6", CubeListBuilder.create().texOffs(28, 259).addBox(-0.2924F, -2.2853F, 0.6606F, 0.5849F, 2.8908F, 0.5344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1428F, 4.5748F, -0.0116F, 0.1643F, -0.0323F, -0.0798F));
		PartDefinition bone31 = bone45.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9175F, -0.6149F, -0.0466F, 0.1753F, -0.1304F, -0.0115F));
		PartDefinition bone31_r1 = bone31.addOrReplaceChild("bone31_r1", CubeListBuilder.create().texOffs(82, 158).addBox(-0.2924F, -1.5245F, -0.1499F, 1.3791F, 7.1959F, 1.4117F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0055F, 1.6275F, 0.3369F, -0.1762F, 0.0359F, -0.217F));
		PartDefinition bone46 = hair.addOrReplaceChild("bone46", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1871F, 49.7112F, 4.8812F, -0.0873F, 1.3963F, 0.0F));
		PartDefinition bone47 = bone46.addOrReplaceChild("bone47", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7768F, 13.0507F, -1.3344F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone47_r1 = bone47.addOrReplaceChild("bone47_r1", CubeListBuilder.create().texOffs(60, 217).addBox(-0.8484F, -0.9063F, 0.0089F, 1.1408F, 4.6884F, 1.0146F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5854F, -11.8739F, 2.2242F, -0.1762F, -0.0359F, 0.217F));
		PartDefinition bone47_r2 = bone47.addOrReplaceChild("bone47_r2", CubeListBuilder.create().texOffs(40, 178).addBox(-0.2924F, -3.686F, -0.4387F, 0.5849F, 5.1482F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8773F, -7.5935F, 0.8878F, -0.1795F, 0.0106F, 0.4747F));
		PartDefinition bone47_r3 = bone47.addOrReplaceChild("bone47_r3", CubeListBuilder.create().texOffs(34, 238).addBox(-0.2924F, -0.262F, -1.0235F, 0.5849F, 0.9211F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1984F, -2.9238F, 0.5394F, -0.005F, 0.0106F, 0.4747F));
		PartDefinition bone47_r4 = bone47.addOrReplaceChild("bone47_r4", CubeListBuilder.create().texOffs(0, 229).addBox(-0.2924F, -0.9768F, -1.0235F, 0.5849F, 1.9535F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6777F, -3.8528F, 0.6987F, -0.1795F, 0.0106F, 0.4747F));
		PartDefinition bone47_r5 = bone47.addOrReplaceChild("bone47_r5", CubeListBuilder.create().texOffs(6, 229).addBox(-0.2924F, 1.0903F, -1.0235F, 0.5849F, 1.9535F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8148F, -7.1314F, 1.4008F, -0.1766F, 0.0339F, 0.6035F));
		PartDefinition bone47_r6 = bone47.addOrReplaceChild("bone47_r6", CubeListBuilder.create().texOffs(80, 233).addBox(-0.2924F, -1.316F, -1.0235F, 0.5849F, 1.2944F, 2.0471F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8479F, -1.1327F, 0.5159F, -0.0102F, 0.0323F, 0.0798F));
		PartDefinition bone47_r7 = bone47.addOrReplaceChild("bone47_r7", CubeListBuilder.create().texOffs(86, 255).addBox(-0.2924F, -2.4525F, 0.4934F, 0.5849F, 2.8908F, 0.7016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4817F, 3.5034F, 0.6541F, 0.1643F, 0.0323F, 0.0798F));
		PartDefinition bone47_r8 = bone47.addOrReplaceChild("bone47_r8", CubeListBuilder.create().texOffs(18, 241).addBox(-0.2924F, -2.0471F, -0.2924F, 0.5849F, 3.2168F, 1.1698F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5225F, 2.9075F, 0.4421F, 0.2952F, 0.0323F, 0.0798F));
		PartDefinition bone47_r9 = bone47.addOrReplaceChild("bone47_r9", CubeListBuilder.create().texOffs(16, 265).addBox(-0.2924F, -2.0471F, 0.5522F, 0.5849F, 2.2132F, 0.3251F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6906F, 0.8637F, 0.5884F, -0.0364F, 0.0323F, 0.0798F));
		PartDefinition bone47_r10 = bone47.addOrReplaceChild("bone47_r10", CubeListBuilder.create().texOffs(44, 233).addBox(-0.2924F, -1.6084F, -0.1462F, 0.5849F, 2.2132F, 1.7546F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6962F, 0.4308F, -0.307F, 0.0334F, 0.0323F, 0.0798F));
		PartDefinition bone61 = bone47.addOrReplaceChild("bone61", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8371F, -2.4199F, 2.5104F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone61_r1 = bone61.addOrReplaceChild("bone61_r1", CubeListBuilder.create().texOffs(38, 217).addBox(-0.2924F, -1.6084F, -0.6227F, 0.5849F, 2.255F, 2.2312F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3413F, 1.7743F, -0.7964F, 0.0334F, 0.0323F, 0.0798F));
		PartDefinition bone61_r2 = bone61.addOrReplaceChild("bone61_r2", CubeListBuilder.create().texOffs(16, 158).addBox(-0.4513F, -4.5256F, -1.2618F, 0.7437F, 5.1847F, 2.2853F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0075F, -1.1673F, 0.0439F, -0.005F, 0.0106F, 0.4747F));
		PartDefinition bone61_r3 = bone61.addOrReplaceChild("bone61_r3", CubeListBuilder.create().texOffs(66, 229).addBox(-0.2924F, 0.356F, -1.2618F, 0.5849F, 0.96F, 2.2853F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, -1.1224F, 0.0401F, -0.0102F, 0.0323F, 0.0798F));
		PartDefinition bone61_r4 = bone61.addOrReplaceChild("bone61_r4", CubeListBuilder.create().texOffs(70, 255).addBox(-0.2924F, -2.0471F, 0.5522F, 0.5849F, 4.0942F, 0.3251F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3357F, 2.2073F, 0.099F, -0.0364F, 0.0323F, 0.0798F));
		PartDefinition bone61_r5 = bone61.addOrReplaceChild("bone61_r5", CubeListBuilder.create().texOffs(82, 224).addBox(-0.2924F, -2.0471F, -0.5307F, 0.5849F, 3.2168F, 1.6463F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1605F, 4.2388F, -0.294F, 0.2952F, 0.0323F, 0.0798F));
		PartDefinition bone61_r6 = bone61.addOrReplaceChild("bone61_r6", CubeListBuilder.create().texOffs(24, 259).addBox(-0.2924F, -2.2853F, 0.6606F, 0.5849F, 2.8908F, 0.5344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1428F, 4.5748F, -0.0116F, 0.1643F, 0.0323F, 0.0798F));
		PartDefinition bone63 = bone46.addOrReplaceChild("bone63", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9175F, -0.6149F, -0.0466F, 0.1753F, 0.1304F, 0.0115F));
		PartDefinition bone43 = hair.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1871F, 49.7112F, 4.8812F, -0.0873F, 1.3963F, 0.0F));
		PartDefinition bone48 = bone43.addOrReplaceChild("bone48", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9175F, -0.6149F, -0.0466F, 0.1753F, 0.1304F, 0.0115F));
		PartDefinition bone48_r1 = bone48.addOrReplaceChild("bone48_r1", CubeListBuilder.create().texOffs(66, 131).addBox(-1.0867F, -1.621F, -1.2618F, 1.3791F, 7.2925F, 1.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.008F, 1.5829F, 0.2375F, -0.0453F, -0.0359F, 0.217F));
		PartDefinition bone34 = hair.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9813F, 52.0939F, 4.8812F, -0.0873F, 1.3963F, 0.0F));
		PartDefinition bone36 = bone34.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6389F, 10.609F, -0.7629F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone41 = bone36.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offset(3.2551F, -2.4199F, 2.5104F));
		PartDefinition bone41_r1 = bone41.addOrReplaceChild("bone41_r1", CubeListBuilder.create().texOffs(40, 229).addBox(-0.2924F, 0.8996F, -0.7022F, 0.5849F, 1.5862F, 2.112F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5094F, 0.4698F, -0.7501F, 0.0334F, 0.0323F, 0.0798F));
		PartDefinition bone41_r2 = bone41.addOrReplaceChild("bone41_r2", CubeListBuilder.create().texOffs(28, 131).addBox(-0.4513F, -0.262F, -1.2618F, 0.7437F, 0.9211F, 4.0723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.005F, 0.0106F, 0.4747F));
		PartDefinition bone41_r3 = bone41.addOrReplaceChild("bone41_r3", CubeListBuilder.create().texOffs(0, 143).addBox(-0.2924F, 0.356F, -1.2618F, 0.5849F, 0.96F, 4.0723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4507F, 0.0387F, -0.0029F, -0.0102F, 0.0323F, 0.0798F));
		PartDefinition bone41_r4 = bone41.addOrReplaceChild("bone41_r4", CubeListBuilder.create().texOffs(64, 217).addBox(-0.2924F, 0.3815F, 0.314F, 0.5849F, 1.6656F, 2.3503F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.515F, 0.9027F, 0.1454F, -0.0364F, 0.0323F, 0.0798F));
		PartDefinition bone41_r5 = bone41.addOrReplaceChild("bone41_r5", CubeListBuilder.create().texOffs(8, 275).addBox(-0.2924F, -0.4587F, 0.3429F, 0.5849F, 1.7873F, 0.5741F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8546F, 5.0733F, -0.0452F, 0.208F, 0.0323F, 0.0798F));
		PartDefinition bone41_r6 = bone41.addOrReplaceChild("bone41_r6", CubeListBuilder.create().texOffs(30, 255).addBox(-0.2924F, -0.4587F, -0.5307F, 0.5849F, 2.0255F, 1.0506F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8562F, 5.0712F, -0.0988F, 0.4698F, 0.0323F, 0.0798F));
		PartDefinition bone41_r7 = bone41.addOrReplaceChild("bone41_r7", CubeListBuilder.create().texOffs(59, 266).addBox(-0.2924F, -2.0471F, -0.5307F, 0.5849F, 2.0255F, 1.6066F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8374F, 4.7692F, -0.2656F, 0.2952F, 0.0323F, 0.0798F));
		PartDefinition bone41_r8 = bone41.addOrReplaceChild("bone41_r8", CubeListBuilder.create().texOffs(0, 259).addBox(-0.2924F, 0.1388F, -1.1607F, 0.5849F, 1.3902F, 1.1698F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7449F, 4.6173F, 2.2142F, 0.6443F, 0.0323F, 0.0798F));
		PartDefinition bone41_r9 = bone41.addOrReplaceChild("bone41_r9", CubeListBuilder.create().texOffs(54, 266).addBox(-0.2924F, -1.0525F, -0.5253F, 0.5849F, 2.3432F, 1.1301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7273F, 4.6041F, 2.7263F, 0.4261F, 0.0323F, 0.0798F));
		PartDefinition bone41_r10 = bone41.addOrReplaceChild("bone41_r10", CubeListBuilder.create().texOffs(82, 255).addBox(-0.2924F, -0.8936F, -1.1607F, 0.5849F, 1.3902F, 1.2095F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7319F, 4.4233F, 2.1369F, 0.5134F, 0.0323F, 0.0798F));
		PartDefinition bone41_r11 = bone41.addOrReplaceChild("bone41_r11", CubeListBuilder.create().texOffs(84, 220).addBox(-0.2924F, -1.5706F, 1.4548F, 0.5849F, 1.3902F, 2.3213F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8526F, 4.8024F, -0.651F, 0.2952F, 0.0323F, 0.0798F));
		PartDefinition bone42 = bone34.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0554F, -3.0566F, 0.5249F, 0.1753F, 0.1304F, 0.0115F));
		PartDefinition bone42_r1 = bone42.addOrReplaceChild("bone42_r1", CubeListBuilder.create().texOffs(0, 207).addBox(-0.2924F, -0.7077F, -0.4387F, 0.5849F, 2.1699F, 2.6427F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1316F, 7.1619F, -1.334F, -0.1795F, 0.0106F, 0.4747F));
		PartDefinition bone42_r2 = bone42.addOrReplaceChild("bone42_r2", CubeListBuilder.create().texOffs(12, 141).addBox(-0.2924F, 1.0903F, -1.103F, 0.5849F, 2.9066F, 3.3972F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1941F, 7.624F, -0.8209F, -0.1766F, 0.0339F, 0.6035F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.231F, -8.5645F, -0.3252F, 0.0F, 0.0F, -0.2182F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(52, 151).addBox(-1.6083F, -1.2114F, -1.4739F, 3.2165F, 2.1851F, 1.7598F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3809F, 5.6081F, 1.8314F, -0.3927F, 0.0F, -0.0436F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(28, 195).addBox(-1.6083F, -1.845F, -0.6027F, 3.2165F, 2.4227F, 0.8886F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2323F, 2.204F, 1.7299F, -0.0436F, 0.0F, -0.0436F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(32, 145).addBox(-1.6083F, -0.261F, -1.4739F, 3.2165F, 2.4227F, 1.7598F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.249F, 2.5872F, 1.7234F, 0.2618F, 0.0F, -0.0436F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(36, 203).addBox(-1.5725F, 1.4746F, 0.2542F, 3.3034F, 2.3572F, 0.6004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.881F, 0.9344F, 0.156F, 2.1204F, -1.5629F, -2.2482F));
		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(68, 259).addBox(-0.2261F, -1.0598F, -0.3002F, 0.6106F, 2.1988F, 0.6004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0986F, 1.438F, -1.5162F, 3.1318F, -0.8679F, 3.1086F));
		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(26, 212).addBox(-1.5725F, -0.6638F, 0.2542F, 3.3034F, 2.1196F, 0.6004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7458F, 1.0167F, 0.1571F, 2.2076F, -1.5629F, -2.2482F));
		PartDefinition LeftArm_r7 = LeftArm.addOrReplaceChild("LeftArm_r7", CubeListBuilder.create().texOffs(8, 265).addBox(-0.3604F, -0.8724F, -0.1429F, 1.0375F, 1.7448F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.207F, 3.4936F, -1.372F, -0.3171F, 0.9801F, -0.3097F));
		PartDefinition LeftArm_r8 = LeftArm.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(0, 235).addBox(-1.3195F, -0.908F, -0.5718F, 2.8765F, 1.9745F, 0.3517F, new CubeDeformation(0.0F)).texOffs(12, 197).addBox(-1.9531F, 1.072F,
				-0.5718F, 4.1437F, 2.2121F, 0.3517F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3889F, 1.1987F, -0.26F, 2.2338F, -1.5629F, -2.2482F));
		PartDefinition LeftArm_r9 = LeftArm.addOrReplaceChild("LeftArm_r9", CubeListBuilder.create().texOffs(66, 241).addBox(-1.4296F, 0.4114F, -0.4289F, 2.8591F, 0.9528F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3098F, -0.1174F, -1.3334F, 0.0873F, 0.0F, -0.0436F));
		PartDefinition LeftArm_r10 = LeftArm.addOrReplaceChild("LeftArm_r10", CubeListBuilder.create().texOffs(62, 224).addBox(-1.4296F, -0.0638F, -0.4289F, 2.8591F, 3.012F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3734F, 1.3403F, -1.2272F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition LeftArm_r11 = LeftArm.addOrReplaceChild("LeftArm_r11", CubeListBuilder.create().texOffs(36, 195).addBox(0.1524F, -0.6137F, -1.4636F, 0.8712F, 0.8753F, 2.9272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5492F, -1.1059F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm_r12 = LeftArm.addOrReplaceChild("LeftArm_r12", CubeListBuilder.create().texOffs(30, 151).addBox(-0.5836F, -1.7137F, -1.4636F, 2.0472F, 1.2274F, 2.9272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.413F, 0.2291F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition LeftArm_r13 = LeftArm.addOrReplaceChild("LeftArm_r13", CubeListBuilder.create().texOffs(32, 72).addBox(-1.61F, -5.1208F, -1.4636F, 2.9272F, 6.0673F, 2.9272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4056F, 4.2083F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm = LeftArm.addOrReplaceChild("LeftForeArm", CubeListBuilder.create(), PartPose.offset(0.4765F, 5.0769F, 0.0325F));
		PartDefinition LeftForeArm_r1 = LeftForeArm.addOrReplaceChild("LeftForeArm_r1", CubeListBuilder.create().texOffs(92, 252).addBox(-1.1108F, -0.4966F, -0.1572F, 2.3008F, 0.9932F, 0.3145F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6487F, -0.4736F, 2.4758F, -2.1049F, -0.2532F, 1.446F));
		PartDefinition LeftForeArm_r2 = LeftForeArm.addOrReplaceChild("LeftForeArm_r2", CubeListBuilder.create().texOffs(23, 266).addBox(-0.2859F, -0.4163F, -0.2144F, 0.9292F, 1.0393F, 0.358F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8417F, 7.1062F, 5.2254F, -1.5761F, -0.2678F, 1.6015F));
		PartDefinition LeftForeArm_r3 = LeftForeArm.addOrReplaceChild("LeftForeArm_r3", CubeListBuilder.create().texOffs(8, 267).addBox(-1.1437F, -1.8584F, -0.143F, 1.7155F, 0.2859F, 0.2859F, new CubeDeformation(0.0F)).texOffs(4, 241)
				.addBox(-1.1436F, -1.5725F, -0.143F, 1.6537F, 3.8709F, 0.2859F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1563F, 4.467F, 3.1203F, -2.3934F, -0.7588F, 2.2953F));
		PartDefinition LeftForeArm_r4 = LeftForeArm.addOrReplaceChild("LeftForeArm_r4", CubeListBuilder.create().texOffs(10, 241).addBox(-0.453F, -2.6745F, -0.143F, 0.9061F, 5.349F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8467F, 3.5461F, -1.9609F, -0.0645F, -0.828F, 0.0039F));
		PartDefinition LeftForeArm_r5 = LeftForeArm.addOrReplaceChild("LeftForeArm_r5", CubeListBuilder.create().texOffs(28, 246).addBox(-1.586F, -0.7738F, -0.1572F, 2.38F, 1.2308F, 0.3937F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9405F, 2.102F, 3.2006F, -2.1465F, -0.4389F, 1.5681F));
		PartDefinition LeftForeArm_r6 = LeftForeArm.addOrReplaceChild("LeftForeArm_r6", CubeListBuilder.create().texOffs(12, 268).addBox(-0.794F, -0.2194F, -0.1573F, 1.588F, 0.4388F, 0.3145F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9196F, 2.4674F, 3.4093F, -2.7566F, -1.0101F, 2.4235F));
		PartDefinition LeftForeArm_r7 = LeftForeArm.addOrReplaceChild("LeftForeArm_r7", CubeListBuilder.create().texOffs(32, 241).addBox(-1.9199F, -3.9047F, -0.1887F, 1.4296F, 4.0028F, 0.3145F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2238F, 2.2057F, 3.4331F, 0.8052F, -1.3229F, -0.9595F));
		PartDefinition LeftForeArm_r8 = LeftForeArm.addOrReplaceChild("LeftForeArm_r8", CubeListBuilder.create().texOffs(28, 229).addBox(-0.8577F, -1.8584F, -0.1715F, 2.2873F, 3.7169F, 0.3145F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5006F, 3.215F, 1.1658F, -1.5771F, -1.0545F, 1.3001F));
		PartDefinition LeftForeArm_r9 = LeftForeArm.addOrReplaceChild("LeftForeArm_r9", CubeListBuilder.create().texOffs(22, 104).addBox(-2.0014F, -5.1385F, -0.1429F, 3.4309F, 7.0081F, 1.1437F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7501F, 4.0826F, 0.0516F, 1.972F, -1.5629F, -2.2482F));
		PartDefinition LeftForeArm_r10 = LeftForeArm.addOrReplaceChild("LeftForeArm_r10", CubeListBuilder.create().texOffs(70, 195).addBox(-0.2144F, -3.288F, -1.5725F, 0.4289F, 3.4309F, 2.8591F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9726F, 6.7081F, 3.9178F, 0.2317F, -0.3405F, -0.1222F));
		PartDefinition LeftForeArm_r11 = LeftForeArm.addOrReplaceChild("LeftForeArm_r11", CubeListBuilder.create().texOffs(78, 255).addBox(-0.2137F, -0.9582F, -0.3256F, 0.4289F, 0.7697F, 1.5224F, new CubeDeformation(0.0F)).texOffs(0, 212)
				.addBox(-0.2147F, -0.1913F, -1.3552F, 0.4289F, 0.6201F, 3.0272F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0564F, 7.1809F, 3.8458F, -0.2919F, -0.3405F, -0.1222F));
		PartDefinition LeftForeArm_r12 = LeftForeArm.addOrReplaceChild("LeftForeArm_r12", CubeListBuilder.create().texOffs(7, 250).addBox(-1.5725F, 0.4646F, -0.2144F, 2.4708F, 0.8829F, 0.3577F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8321F, 6.808F, 5.0547F, -1.5805F, -1.0096F, 1.6082F));
		PartDefinition LeftForeArm_r13 = LeftForeArm.addOrReplaceChild("LeftForeArm_r13", CubeListBuilder.create().texOffs(18, 239).addBox(-1.5725F, -1.7512F, -0.1429F, 2.8591F, 1.787F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8375F, 7.1297F, 4.2785F, 1.5939F, -1.3466F, -1.5641F));
		PartDefinition LeftForeArm_r14 = LeftForeArm.addOrReplaceChild("LeftForeArm_r14", CubeListBuilder.create().texOffs(62, 182).addBox(-1.9656F, -2.7162F, -0.2859F, 3.5739F, 3.2108F, 0.5718F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2128F, 7.5936F, 5.2405F, 0.2182F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm_r15 = LeftForeArm.addOrReplaceChild("LeftForeArm_r15", CubeListBuilder.create().texOffs(57, 130).addBox(-2.4303F, 0.679F, -0.3144F, 3.6068F, 6.6474F, 0.4287F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5815F, -1.0646F, 1.1288F, 1.584F, -1.172F, -1.5537F));
		PartDefinition LeftForeArm_r16 = LeftForeArm.addOrReplaceChild("LeftForeArm_r16", CubeListBuilder.create().texOffs(40, 94).addBox(-1.3706F, -2.3994F, -2.6619F, 2.8997F, 3.5315F, 2.9478F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0711F, -0.7225F, 1.6892F, 0.6981F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm_r17 = LeftForeArm.addOrReplaceChild("LeftForeArm_r17", CubeListBuilder.create().texOffs(98, 151).addBox(-1.7869F, 4.1457F, -0.1429F, 3.2165F, 5.4323F, 0.5718F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0978F, -3.6166F, 0.4952F, 0.4363F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm_r18 = LeftForeArm.addOrReplaceChild("LeftForeArm_r18", CubeListBuilder.create().texOffs(70, 104).addBox(-1.4426F, 4.3737F, -0.4034F, 3.145F, 8.6316F, 0.6796F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3867F, -6.6467F, -0.0221F, 2.2774F, -1.5629F, -2.2482F));
		PartDefinition LeftForeArm_r19 = LeftForeArm.addOrReplaceChild("LeftForeArm_r19",
				CubeListBuilder.create().texOffs(12, 265).addBox(-0.8336F, 0.672F, -0.143F, 0.2416F, 3.232F, 0.2859F, new CubeDeformation(0.0F)).texOffs(52, 217).addBox(-0.596F, -3.288F, -0.143F, 1.0336F, 7.192F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3586F, 2.4575F, -1.8875F, -0.0871F, 1.0456F, -0.119F));
		PartDefinition LeftForeArm_r20 = LeftForeArm.addOrReplaceChild("LeftForeArm_r20", CubeListBuilder.create().texOffs(68, 151).addBox(-1.4296F, -0.143F, -0.4289F, 2.8591F, 7.192F, 0.2859F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0274F, -0.749F, -1.7718F, -0.0436F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm_r21 = LeftForeArm.addOrReplaceChild("LeftForeArm_r21", CubeListBuilder.create().texOffs(10, 151).addBox(-1.61F, -2.5813F, -1.4636F, 2.9272F, 2.0624F, 2.0624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0069F, 0.5983F, -0.8281F, -0.7854F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm_r22 = LeftForeArm.addOrReplaceChild("LeftForeArm_r22", CubeListBuilder.create().texOffs(72, 72).addBox(-1.61F, 1.6118F, -1.4636F, 2.9272F, 5.7347F, 2.9272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0999F, -1.5333F, -0.0325F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftHand = LeftForeArm.addOrReplaceChild("LeftHand", CubeListBuilder.create(), PartPose.offset(0.0931F, 5.5837F, -0.0328F));
		PartDefinition LeftHand_r1 = LeftHand.addOrReplaceChild("LeftHand_r1", CubeListBuilder.create().texOffs(42, 145).addBox(-1.4636F, -1.5368F, -1.4636F, 2.9272F, 2.0757F, 2.0624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0166F, 0.2806F, 0.6583F, 0.7854F, 0.0F, -0.0436F));
		PartDefinition LeftHand_r2 = LeftHand.addOrReplaceChild("LeftHand_r2", CubeListBuilder.create().texOffs(54, 114).addBox(-1.61F, 7.3332F, -1.4636F, 2.9272F, 1.743F, 2.9272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.193F, -7.117F, 0.0003F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftHandLocator = LeftHand.addOrReplaceChild("LeftHandLocator", CubeListBuilder.create(), PartPose.offset(-0.7978F, 3.2809F, 0.3588F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.231F, -8.5645F, -0.3252F, 0.0F, 0.0F, 0.2182F));
		PartDefinition LeftArm_r14 = RightArm.addOrReplaceChild("LeftArm_r14", CubeListBuilder.create().texOffs(52, 151).mirror().addBox(-1.6082F, -1.2114F, -1.4739F, 3.2165F, 2.1851F, 1.7598F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3809F, 5.6081F, 1.8314F, -0.3927F, 0.0F, 0.0436F));
		PartDefinition LeftArm_r15 = RightArm.addOrReplaceChild("LeftArm_r15", CubeListBuilder.create().texOffs(28, 195).mirror().addBox(-1.6083F, -1.845F, -0.6027F, 3.2165F, 2.4227F, 0.8886F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2323F, 2.204F, 1.7299F, -0.0436F, 0.0F, 0.0436F));
		PartDefinition LeftArm_r16 = RightArm.addOrReplaceChild("LeftArm_r16", CubeListBuilder.create().texOffs(32, 145).mirror().addBox(-1.6082F, -0.261F, -1.4739F, 3.2165F, 2.4227F, 1.7598F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.249F, 2.5872F, 1.7234F, 0.2618F, 0.0F, 0.0436F));
		PartDefinition LeftArm_r17 = RightArm.addOrReplaceChild("LeftArm_r17", CubeListBuilder.create().texOffs(36, 203).mirror().addBox(-1.7309F, 1.4746F, 0.2542F, 3.3034F, 2.3572F, 0.6004F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.881F, 0.9344F, 0.156F, 2.1204F, 1.5629F, 2.2482F));
		PartDefinition LeftArm_r18 = RightArm.addOrReplaceChild("LeftArm_r18", CubeListBuilder.create().texOffs(68, 259).mirror().addBox(-0.3845F, -1.0598F, -0.3002F, 0.6106F, 2.1988F, 0.6004F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0986F, 1.438F, -1.5162F, 3.1318F, 0.8679F, -3.1086F));
		PartDefinition LeftArm_r19 = RightArm.addOrReplaceChild("LeftArm_r19", CubeListBuilder.create().texOffs(26, 212).mirror().addBox(-1.7309F, -0.6638F, 0.2542F, 3.3034F, 2.1196F, 0.6004F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7458F, 1.0167F, 0.1571F, 2.2076F, 1.5629F, 2.2482F));
		PartDefinition LeftArm_r20 = RightArm.addOrReplaceChild("LeftArm_r20", CubeListBuilder.create().texOffs(8, 265).mirror().addBox(-0.6772F, -0.8724F, -0.1429F, 1.0375F, 1.7448F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.207F, 3.4936F, -1.372F, -0.3171F, -0.9801F, 0.3097F));
		PartDefinition LeftArm_r21 = RightArm.addOrReplaceChild("LeftArm_r21", CubeListBuilder.create().texOffs(0, 235).mirror().addBox(-1.5571F, -0.908F, -0.5718F, 2.8765F, 1.9745F, 0.3517F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 197)
				.mirror().addBox(-2.1907F, 1.072F, -0.5718F, 4.1437F, 2.2121F, 0.3517F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3889F, 1.1987F, -0.26F, 2.2338F, 1.5629F, 2.2482F));
		PartDefinition LeftArm_r22 = RightArm.addOrReplaceChild("LeftArm_r22", CubeListBuilder.create().texOffs(66, 241).mirror().addBox(-1.4296F, 0.4114F, -0.4289F, 2.8591F, 0.9528F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3098F, -0.1174F, -1.3334F, 0.0873F, 0.0F, 0.0436F));
		PartDefinition LeftArm_r23 = RightArm.addOrReplaceChild("LeftArm_r23", CubeListBuilder.create().texOffs(62, 224).mirror().addBox(-1.4296F, -0.0638F, -0.4289F, 2.8591F, 3.012F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3734F, 1.3403F, -1.2272F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition LeftArm_r24 = RightArm.addOrReplaceChild("LeftArm_r24", CubeListBuilder.create().texOffs(36, 195).mirror().addBox(-1.0236F, -0.6137F, -1.4636F, 0.8712F, 0.8753F, 2.9272F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5492F, -1.1059F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm_r25 = RightArm.addOrReplaceChild("LeftArm_r25", CubeListBuilder.create().texOffs(30, 151).mirror().addBox(-1.4636F, -1.7137F, -1.4636F, 2.0472F, 1.2274F, 2.9272F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.413F, 0.2291F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition LeftArm_r26 = RightArm.addOrReplaceChild("LeftArm_r26", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(-1.3172F, -5.1208F, -1.4636F, 2.9272F, 6.0673F, 2.9272F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4056F, 4.2083F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightForeArm = RightArm.addOrReplaceChild("RightForeArm", CubeListBuilder.create(), PartPose.offset(-0.4765F, 5.0769F, 0.0325F));
		PartDefinition LeftForeArm_r23 = RightForeArm.addOrReplaceChild("LeftForeArm_r23", CubeListBuilder.create().texOffs(92, 252).mirror().addBox(-1.19F, -0.4966F, -0.1572F, 2.3008F, 0.9932F, 0.3145F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6487F, -0.4736F, 2.4758F, -2.1049F, 0.2532F, -1.446F));
		PartDefinition LeftForeArm_r24 = RightForeArm.addOrReplaceChild("LeftForeArm_r24", CubeListBuilder.create().texOffs(23, 266).mirror().addBox(-0.6433F, -0.4163F, -0.2144F, 0.9292F, 1.0393F, 0.358F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8417F, 7.1062F, 5.2254F, -1.5761F, 0.2678F, -1.6015F));
		PartDefinition LeftForeArm_r25 = RightForeArm.addOrReplaceChild("LeftForeArm_r25", CubeListBuilder.create().texOffs(8, 267).mirror().addBox(-0.5718F, -1.8584F, -0.143F, 1.7155F, 0.2859F, 0.2859F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 241).mirror().addBox(-0.5101F, -1.5725F, -0.143F, 1.6537F, 3.8709F, 0.2859F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1563F, 4.467F, 3.1203F, -2.3934F, 0.7588F, -2.2953F));
		PartDefinition LeftForeArm_r26 = RightForeArm.addOrReplaceChild("LeftForeArm_r26", CubeListBuilder.create().texOffs(10, 241).mirror().addBox(-0.453F, -2.6745F, -0.143F, 0.9061F, 5.349F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8467F, 3.5461F, -1.9609F, -0.0645F, 0.828F, -0.0039F));
		PartDefinition LeftForeArm_r27 = RightForeArm.addOrReplaceChild("LeftForeArm_r27", CubeListBuilder.create().texOffs(28, 246).mirror().addBox(-0.794F, -0.7738F, -0.1572F, 2.38F, 1.2308F, 0.3937F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9405F, 2.102F, 3.2006F, -2.1465F, 0.4389F, -1.5681F));
		PartDefinition LeftForeArm_r28 = RightForeArm.addOrReplaceChild("LeftForeArm_r28", CubeListBuilder.create().texOffs(12, 268).mirror().addBox(-0.794F, -0.2194F, -0.1573F, 1.588F, 0.4388F, 0.3145F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9196F, 2.4674F, 3.4093F, -2.7566F, 1.0101F, -2.4235F));
		PartDefinition LeftForeArm_r29 = RightForeArm.addOrReplaceChild("LeftForeArm_r29", CubeListBuilder.create().texOffs(32, 241).mirror().addBox(0.4903F, -3.9047F, -0.1887F, 1.4296F, 4.0028F, 0.3145F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2238F, 2.2057F, 3.4331F, 0.8052F, 1.3229F, 0.9595F));
		PartDefinition LeftForeArm_r30 = RightForeArm.addOrReplaceChild("LeftForeArm_r30", CubeListBuilder.create().texOffs(28, 229).mirror().addBox(-1.4296F, -1.8584F, -0.1715F, 2.2873F, 3.7169F, 0.3145F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5006F, 3.215F, 1.1658F, -1.5771F, 1.0545F, -1.3001F));
		PartDefinition LeftForeArm_r31 = RightForeArm.addOrReplaceChild("LeftForeArm_r31", CubeListBuilder.create().texOffs(22, 104).mirror().addBox(-1.4295F, -5.1385F, -0.1429F, 3.4309F, 7.0081F, 1.1437F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7501F, 4.0826F, 0.0516F, 1.972F, 1.5629F, 2.2482F));
		PartDefinition LeftForeArm_r32 = RightForeArm.addOrReplaceChild("LeftForeArm_r32", CubeListBuilder.create().texOffs(70, 195).mirror().addBox(-0.2144F, -3.288F, -1.5725F, 0.4289F, 3.4309F, 2.8591F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9726F, 6.7081F, 3.9178F, 0.2317F, 0.3405F, 0.1222F));
		PartDefinition LeftForeArm_r33 = RightForeArm.addOrReplaceChild("LeftForeArm_r33", CubeListBuilder.create().texOffs(78, 255).mirror().addBox(-0.2151F, -0.9582F, -0.3256F, 0.4289F, 0.7697F, 1.5224F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 212).mirror().addBox(-0.2141F, -0.1913F, -1.3552F, 0.4289F, 0.6201F, 3.0272F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0564F, 7.1809F, 3.8458F, -0.2919F, 0.3405F, 0.1222F));
		PartDefinition LeftForeArm_r34 = RightForeArm.addOrReplaceChild("LeftForeArm_r34", CubeListBuilder.create().texOffs(7, 250).mirror().addBox(-0.8983F, 0.4646F, -0.2144F, 2.4708F, 0.8829F, 0.3577F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8321F, 6.808F, 5.0547F, -1.5805F, 1.0096F, -1.6082F));
		PartDefinition LeftForeArm_r35 = RightForeArm.addOrReplaceChild("LeftForeArm_r35", CubeListBuilder.create().texOffs(18, 239).mirror().addBox(-1.2866F, -1.7512F, -0.1429F, 2.8591F, 1.787F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8375F, 7.1297F, 4.2785F, 1.5939F, 1.3466F, 1.5641F));
		PartDefinition LeftForeArm_r36 = RightForeArm.addOrReplaceChild("LeftForeArm_r36", CubeListBuilder.create().texOffs(62, 182).mirror().addBox(-1.6083F, -2.7162F, -0.2859F, 3.5739F, 3.2108F, 0.5718F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2128F, 7.5936F, 5.2405F, 0.2182F, 0.0F, 0.0436F));
		PartDefinition LeftForeArm_r37 = RightForeArm.addOrReplaceChild("LeftForeArm_r37", CubeListBuilder.create().texOffs(57, 130).mirror().addBox(-1.1765F, 0.679F, -0.3144F, 3.6068F, 6.6474F, 0.4287F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5815F, -1.0646F, 1.1288F, 1.584F, 1.172F, 1.5537F));
		PartDefinition LeftForeArm_r38 = RightForeArm.addOrReplaceChild("LeftForeArm_r38", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-1.5291F, -2.3994F, -2.6619F, 2.8997F, 3.5315F, 2.9478F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0711F, -0.7225F, 1.6892F, 0.6981F, 0.0F, 0.0436F));
		PartDefinition LeftForeArm_r39 = RightForeArm.addOrReplaceChild("LeftForeArm_r39", CubeListBuilder.create().texOffs(98, 151).mirror().addBox(-1.4296F, 4.1457F, -0.1429F, 3.2165F, 5.4323F, 0.5718F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0978F, -3.6166F, 0.4952F, 0.4363F, 0.0F, 0.0436F));
		PartDefinition LeftForeArm_r40 = RightForeArm.addOrReplaceChild("LeftForeArm_r40", CubeListBuilder.create().texOffs(70, 104).mirror().addBox(-1.7024F, 4.3737F, -0.4034F, 3.145F, 8.6316F, 0.6796F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3867F, -6.6467F, -0.0221F, 2.2774F, 1.5629F, 2.2482F));
		PartDefinition LeftForeArm_r41 = RightForeArm.addOrReplaceChild("LeftForeArm_r41", CubeListBuilder.create().texOffs(12, 265).mirror().addBox(0.592F, 0.672F, -0.143F, 0.2416F, 3.232F, 0.2859F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 217).mirror().addBox(-0.4376F, -3.288F, -0.143F, 1.0336F, 7.192F, 0.2859F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3586F, 2.4575F, -1.8875F, -0.0871F, -1.0456F, 0.119F));
		PartDefinition LeftForeArm_r42 = RightForeArm.addOrReplaceChild("LeftForeArm_r42", CubeListBuilder.create().texOffs(68, 151).mirror().addBox(-1.4296F, -0.143F, -0.4289F, 2.8591F, 7.192F, 0.2859F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0274F, -0.749F, -1.7718F, -0.0436F, 0.0F, 0.0436F));
		PartDefinition LeftForeArm_r43 = RightForeArm.addOrReplaceChild("LeftForeArm_r43", CubeListBuilder.create().texOffs(10, 151).mirror().addBox(-1.3172F, -2.5813F, -1.4636F, 2.9272F, 2.0624F, 2.0624F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0069F, 0.5983F, -0.8281F, -0.7854F, 0.0F, 0.0436F));
		PartDefinition LeftForeArm_r44 = RightForeArm.addOrReplaceChild("LeftForeArm_r44", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-1.3173F, 1.6118F, -1.4636F, 2.9272F, 5.7347F, 2.9272F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0999F, -1.5333F, -0.0325F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightHand = RightForeArm.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-0.0931F, 5.5837F, -0.0328F));
		PartDefinition LeftHand_r3 = RightHand.addOrReplaceChild("LeftHand_r3", CubeListBuilder.create().texOffs(42, 145).mirror().addBox(-1.4636F, -1.5368F, -1.4636F, 2.9272F, 2.0757F, 2.0624F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0166F, 0.2806F, 0.6583F, 0.7854F, 0.0F, 0.0436F));
		PartDefinition LeftHand_r4 = RightHand.addOrReplaceChild("LeftHand_r4", CubeListBuilder.create().texOffs(54, 114).mirror().addBox(-1.3173F, 7.3332F, -1.4636F, 2.9272F, 1.743F, 2.9272F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.193F, -7.117F, 0.0003F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Yu_bi = RightHand.addOrReplaceChild("Yu_bi",
				CubeListBuilder.create().texOffs(135, 8).addBox(-5.888F, -12.25F, 15.2183F, 1.0F, 42.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(135, 76).addBox(-5.838F, -9.95F, 14.6673F, 0.9F, 1.5F, 0.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8006F, 15.6539F, -17.6745F, 1.4399F, 0.0F, 0.0F));
		PartDefinition bone62 = Yu_bi.addOrReplaceChild("bone62", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -9.0F, 15.0F, -0.063F, 0.2071F, -0.2834F));
		PartDefinition cube_r1 = bone62.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(135, 61).addBox(-0.5418F, 29.7573F, -10.368F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.7807F, -13.8047F, -23.9857F, 1.0528F, -0.6729F, 0.0017F));
		PartDefinition cube_r2 = bone62.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(143, 71).addBox(2.937F, 29.4343F, -8.5348F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.2054F, -11.143F, -24.6182F, 0.9602F, -0.7613F, 0.0445F));
		PartDefinition cube_r3 = bone62.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(159, 66).addBox(3.007F, 30.2899F, -0.4141F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1808F, -8.7192F, -25.5173F, 0.6984F, -0.7613F, 0.0445F));
		PartDefinition cube_r4 = bone62.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(151, 56).addBox(3.637F, 32.3605F, 2.6829F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.188F, -8.0444F, -28.3295F, 0.6111F, -0.7613F, 0.0445F));
		PartDefinition cube_r5 = bone62.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(159, 56).addBox(2.5093F, 31.1153F, 5.3575F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6347F, -5.551F, -28.621F, 0.52F, -0.7431F, 0.0404F));
		PartDefinition cube_r6 = bone62.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(157, 71).addBox(0.5119F, -2.7657F, -2.6994F, 0.7F, 2.1F, 2.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0727F, 1.6354F, -0.1414F, 0.0F, -0.6545F, 0.0F));
		PartDefinition cube_r7 = bone62.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(143, 61).addBox(-1.0182F, 28.0287F, 10.7188F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6877F, -21.7146F, -19.0872F, 0.3491F, -0.6545F, 0.0F));
		PartDefinition cube_r8 = bone62.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(143, 51).addBox(-0.9482F, 30.1315F, 2.804F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.1533F, -19.6808F, -20.6138F, 0.6109F, -0.6545F, 0.0F));
		PartDefinition cube_r9 = bone62.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(159, 61).addBox(-1.2418F, 29.5533F, -0.1486F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.5343F, -17.1646F, -20.7725F, 0.7038F, -0.6729F, 0.0017F));
		PartDefinition cube_r10 = bone62.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(143, 66).addBox(-0.6118F, 31.4502F, -2.2824F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.273F, -16.2821F, -23.6105F, 0.791F, -0.6729F, 0.0017F));
		PartDefinition bone60 = Yu_bi.addOrReplaceChild("bone60", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75F, -9.0F, 15.0F, -0.063F, -0.2071F, 0.2834F));
		PartDefinition cube_r11 = bone60.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(151, 51).addBox(-8.1994F, 25.7852F, -16.3415F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5283F, -17.0373F, -23.9857F, 1.0528F, 0.6729F, -0.0017F));
		PartDefinition cube_r12 = bone60.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(135, 71).addBox(-11.174F, 25.1441F, -14.9308F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.953F, -14.3756F, -24.6182F, 0.9602F, 0.7613F, -0.0445F));
		PartDefinition cube_r13 = bone60.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(151, 66).addBox(-11.244F, 27.8013F, -7.7026F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9284F, -11.9518F, -25.5173F, 0.6984F, 0.7613F, -0.0445F));
		PartDefinition cube_r14 = bone60.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(159, 51).addBox(-11.874F, 30.5167F, -4.7947F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9355F, -11.277F, -28.3295F, 0.6111F, 0.7613F, -0.0445F));
		PartDefinition cube_r15 = bone60.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(135, 56).addBox(-10.8674F, 30.0691F, -2.1513F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3823F, -8.7836F, -28.621F, 0.52F, 0.7431F, -0.0404F));
		PartDefinition cube_r16 = bone60.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(151, 71).addBox(-7.2053F, 23.4747F, 12.8693F, 0.7F, 2.1F, 2.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6748F, -24.5972F, -16.1414F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r17 = bone60.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 56).addBox(-7.8353F, 28.9339F, 3.7314F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4353F, -24.9472F, -19.0872F, 0.3491F, 0.6545F, 0.0F));
		PartDefinition cube_r18 = bone60.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(135, 51).addBox(-7.9053F, 29.1974F, -4.1796F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9008F, -22.9133F, -20.6138F, 0.6109F, 0.6545F, 0.0F));
		PartDefinition cube_r19 = bone60.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(151, 61).addBox(-7.4994F, 27.8638F, -7.1205F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2818F, -20.3972F, -20.7725F, 0.7038F, 0.6729F, -0.0017F));
		PartDefinition cube_r20 = bone60.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(135, 66).addBox(-8.1294F, 29.1595F, -9.0805F, 0.7F, 2.1F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0205F, -19.5147F, -23.6105F, 0.791F, 0.6729F, -0.0017F));
		PartDefinition RightHandLocator = RightHand.addOrReplaceChild("RightHandLocator", CubeListBuilder.create(), PartPose.offset(0.7978F, 3.2809F, 0.3588F));
		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition AllBody = Root.addOrReplaceChild("AllBody", CubeListBuilder.create(), PartPose.offset(-0.0134F, -24.0022F, -0.3252F));
		PartDefinition UpBody = AllBody.addOrReplaceChild("UpBody", CubeListBuilder.create().texOffs(75, 43).addBox(-4.5401F, -3.1933F, -1.7075F, 9.1069F, 3.2525F, 3.4151F, new CubeDeformation(0.0F)).texOffs(20, 56).addBox(-4.3449F, -4.1691F,
				-1.6262F, 8.6899F, 0.9757F, 3.2525F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0296F, 0.0F));
		PartDefinition UpBody_r1 = UpBody.addOrReplaceChild("UpBody_r1", CubeListBuilder.create().texOffs(58, 212).addBox(-1.2975F, -2.6822F, -0.4667F, 2.5949F, 2.7245F, 0.8631F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0951F, -1.98F, -0.1222F, 0.0F, 0.0F));
		PartDefinition UpBody_r2 = UpBody.addOrReplaceChild("UpBody_r2", CubeListBuilder.create().texOffs(78, 65).addBox(-4.5535F, -1.6262F, -0.6516F, 9.1069F, 3.0765F, 0.5991F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0134F, -1.5671F, 2.024F, 0.1571F, 0.0F, 0.0F));
		PartDefinition bone57 = UpBody.addOrReplaceChild("bone57", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6703F, -2.3189F, -1.98F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone57_r1 = bone57.addOrReplaceChild("bone57_r1", CubeListBuilder.create().texOffs(16, 259).addBox(-0.5935F, -1.8022F, -0.4315F, 0.6589F, 2.0645F, 0.8631F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8692F, 0.7088F, 0.6916F, 0.0F, -0.4363F, -0.2618F));
		PartDefinition bone57_r2 = bone57.addOrReplaceChild("bone57_r2", CubeListBuilder.create().texOffs(88, 253).addBox(-0.3295F, -0.8782F, -0.4315F, 0.6589F, 1.3165F, 1.3031F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9332F, 1.8723F, 0.58F, 0.0F, -0.4363F, -0.2618F));
		PartDefinition bone57_r3 = bone57.addOrReplaceChild("bone57_r3", CubeListBuilder.create().texOffs(58, 246).addBox(-1.2975F, 0.9138F, -0.4316F, 1.9789F, 0.6245F, 0.8631F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.32F, 1.54F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone57_r4 = bone57.addOrReplaceChild("bone57_r4", CubeListBuilder.create().texOffs(6, 233).addBox(-1.5615F, -1.7142F, -0.2995F, 1.7149F, 2.7245F, 0.8631F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2355F, 1.6318F, -0.132F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone57_r5 = bone57.addOrReplaceChild("bone57_r5", CubeListBuilder.create().texOffs(64, 168).addBox(-1.3855F, -2.3302F, -0.4316F, 2.7709F, 4.6605F, 0.8631F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0467F, 0.4933F, 0.234F, 0.0F, -0.1745F, -0.2618F));
		PartDefinition bone58 = UpBody.addOrReplaceChild("bone58", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6435F, -2.3189F, -1.98F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone58_r1 = bone58.addOrReplaceChild("bone58_r1", CubeListBuilder.create().texOffs(16, 259).mirror().addBox(-0.0655F, -1.8022F, -0.4315F, 0.6589F, 2.0645F, 0.8631F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8692F, 0.7088F, 0.6916F, 0.0F, 0.4363F, 0.2618F));
		PartDefinition bone58_r2 = bone58.addOrReplaceChild("bone58_r2", CubeListBuilder.create().texOffs(88, 253).mirror().addBox(-0.3295F, -0.8782F, -0.4315F, 0.6589F, 1.3165F, 1.3031F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9332F, 1.8723F, 0.58F, 0.0F, 0.4363F, 0.2618F));
		PartDefinition bone58_r3 = bone58.addOrReplaceChild("bone58_r3", CubeListBuilder.create().texOffs(58, 246).mirror().addBox(-0.6815F, 0.9138F, -0.4316F, 1.9789F, 0.6245F, 0.8631F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.32F, 1.54F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone58_r4 = bone58.addOrReplaceChild("bone58_r4", CubeListBuilder.create().texOffs(6, 233).mirror().addBox(-0.1535F, -1.7142F, -0.2995F, 1.7149F, 2.7245F, 0.8631F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2355F, 1.6318F, -0.132F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone58_r5 = bone58.addOrReplaceChild("bone58_r5", CubeListBuilder.create().texOffs(64, 168).mirror().addBox(-1.3855F, -2.3302F, -0.4316F, 2.7709F, 4.6605F, 0.8631F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0467F, 0.4933F, 0.234F, 0.0F, 0.1745F, 0.2618F));
		PartDefinition UpperBody = UpBody.addOrReplaceChild("UpperBody", CubeListBuilder.create().texOffs(0, 36).addBox(-4.1881F, -6.8204F, -1.9515F, 8.4029F, 3.5777F, 3.903F, new CubeDeformation(0.0F)).texOffs(78, 105).addBox(-1.9515F, -8.7719F,
				-1.301F, 3.903F, 1.9515F, 2.602F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.2032F, 0.0F));
		PartDefinition UpperBody_r1 = UpperBody.addOrReplaceChild("UpperBody_r1", CubeListBuilder.create().texOffs(29, 174).addBox(-2.7435F, -0.4038F, -0.333F, 5.487F, 0.7635F, 0.754F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0921F, 1.672F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone65 = UpperBody.addOrReplaceChild("bone65", CubeListBuilder.create().texOffs(68, 251).addBox(-0.6521F, -8.2242F, -1.3925F, 1.3042F, 1.3585F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0134F, 3.6773F, -7.9292F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone65_r1 = bone65.addOrReplaceChild("bone65_r1", CubeListBuilder.create().texOffs(64, 246).addBox(-1.7389F, -0.6792F, -0.4347F, 1.6639F, 1.0868F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6368F, -5.5152F, -0.9578F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bone65_r2 = bone65.addOrReplaceChild("bone65_r2", CubeListBuilder.create().texOffs(0, 251).addBox(-0.6521F, -0.6792F, -0.4347F, 1.3042F, 1.7413F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2523F, -6.6035F, -0.9578F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone66 = bone65.addOrReplaceChild("bone66", CubeListBuilder.create().texOffs(46, 239).addBox(-0.5035F, 0.4931F, -0.4348F, 2.391F, 0.8151F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0128F, -4.1587F, -0.0412F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone66_r1 = bone66.addOrReplaceChild("bone66_r1", CubeListBuilder.create().texOffs(46, 237).addBox(-0.6521F, -1.0868F, -0.4348F, 2.391F, 0.8151F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2534F, 1.1206F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone66_r2 = bone66.addOrReplaceChild("bone66_r2", CubeListBuilder.create().texOffs(36, 199).addBox(-0.6521F, -0.7401F, -0.4347F, 3.7495F, 1.2835F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7703F, -1.8394F, 0.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition bone66_r3 = bone66.addOrReplaceChild("bone66_r3", CubeListBuilder.create().texOffs(100, 233).addBox(-0.6521F, -1.9267F, -0.4349F, 1.3042F, 3.3667F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5526F, -0.3443F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone66_r4 = bone66.addOrReplaceChild("bone66_r4", CubeListBuilder.create().texOffs(20, 203).addBox(-0.6521F, 0.5434F, -0.4347F, 3.043F, 2.1736F, 0.8694F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7691F, -2.2069F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition bone = UpperBody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0134F, 6.0973F, 3.9508F));
		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(16, 138).addBox(-2.2903F, -1.9379F, -1.422F, 4.5806F, 1.5483F, 1.3339F, new CubeDeformation(0.0F)).texOffs(56, 61).addBox(-4.4925F, -0.4278F, -0.894F,
				8.985F, 4.8197F, 0.8059F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.6028F, -1.3956F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(92, 97).addBox(-1.7846F, -0.603F, -12.0711F, 2.0111F, 1.3409F, 4.1147F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4505F, -12.2955F, 5.9662F, -0.0146F, -0.0275F, 0.0499F));
		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(0, 123).addBox(-0.0375F, -0.6705F, -2.0354F, 1.0431F, 1.3409F, 4.1147F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0688F, -12.3993F, -4.0871F, 0.0078F, -0.0301F, -0.6922F));
		PartDefinition bone_r4 = bone.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(0, 104).addBox(-0.2264F, -0.603F, -12.0711F, 2.0111F, 1.3409F, 4.1147F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4505F, -12.2955F, 5.9662F, -0.0146F, 0.0275F, -0.0499F));
		PartDefinition bone_r5 = bone.addOrReplaceChild("bone_r5", CubeListBuilder.create().texOffs(10, 123).addBox(-1.0055F, -0.6705F, -2.0354F, 1.0431F, 1.3409F, 4.1147F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0688F, -12.3993F, -4.0871F, 0.0078F, 0.0301F, 0.6922F));
		PartDefinition bone107 = bone.addOrReplaceChild("bone107", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7696F, -8.2702F, 0.5051F, 0.2468F, -0.0407F, 0.0893F));
		PartDefinition bone110 = bone107.addOrReplaceChild("bone110", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8793F, -0.5543F, 8.4949F, 0.0038F, -0.0435F, -1.7454F));
		PartDefinition bone110_r1 = bone110.addOrReplaceChild("bone110_r1", CubeListBuilder.create().texOffs(30, 270).addBox(9.0645F, -3.0128F, 0.6503F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4717F, -0.0195F, -0.361F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone110_r2 = bone110.addOrReplaceChild("bone110_r2", CubeListBuilder.create().texOffs(0, 271).addBox(9.0645F, -3.0128F, 3.3458F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0674F, -0.0195F, -0.361F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone110_r3 = bone110.addOrReplaceChild("bone110_r3", CubeListBuilder.create().texOffs(8, 268).addBox(2.9639F, -3.0128F, -9.6755F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(30, 268).addBox(1.3466F, -3.0128F,
				-9.6755F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2246F, -0.0544F, -0.2309F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone110_r4 = bone110.addOrReplaceChild("bone110_r4",
				CubeListBuilder.create().texOffs(14, 270).addBox(3.8624F, -3.0128F, -9.4239F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(32, 269)
						.addBox(2.2451F, -3.0128F, -9.5497F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(34, 268).addBox(0.6278F, -3.0128F, -9.5497F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3145F, -0.0777F, -0.1441F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone110_r5 = bone110.addOrReplaceChild("bone110_r5", CubeListBuilder.create().texOffs(0, 271).addBox(9.0645F, -3.0128F, 4.2443F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6398F, -0.0195F, -0.361F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone110_r6 = bone110.addOrReplaceChild("bone110_r6", CubeListBuilder.create().texOffs(0, 271).addBox(9.0645F, -3.0128F, 3.3458F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5499F, -0.0195F, -0.361F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone110_r7 = bone110.addOrReplaceChild("bone110_r7", CubeListBuilder.create().texOffs(0, 271).addBox(9.0645F, -3.0128F, 1.998F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0108F, -0.0195F, -0.361F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone111 = bone107.addOrReplaceChild("bone111", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5658F, 3.0069F, 8.1261F, 0.0F, -0.0436F, -1.6581F));
		PartDefinition bone111_r1 = bone111.addOrReplaceChild("bone111_r1", CubeListBuilder.create().texOffs(28, 270).addBox(9.0179F, -3.1866F, 0.6412F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.356F, -0.2101F, -0.2281F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone111_r2 = bone111.addOrReplaceChild("bone111_r2", CubeListBuilder.create().texOffs(38, 267).addBox(2.9548F, -3.1867F, -9.629F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(20, 268).addBox(1.3375F, -3.1867F,
				-9.629F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2256F, -0.245F, -0.0979F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone111_r3 = bone111.addOrReplaceChild("bone111_r3", CubeListBuilder.create().texOffs(0, 271).addBox(9.0179F, -3.1866F, 4.2352F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1896F, -0.2101F, -0.2281F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone111_r4 = bone111.addOrReplaceChild("bone111_r4", CubeListBuilder.create().texOffs(0, 271).addBox(9.0179F, -3.1866F, 3.3367F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0997F, -0.2101F, -0.2281F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone111_r5 = bone111.addOrReplaceChild("bone111_r5", CubeListBuilder.create().texOffs(0, 271).addBox(9.0179F, -3.1866F, 1.989F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5606F, -0.2101F, -0.2281F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone111_r6 = bone111.addOrReplaceChild("bone111_r6", CubeListBuilder.create().texOffs(40, 265).addBox(3.8533F, -3.1866F, -9.5031F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(36, 270).addBox(2.6136F, -3.1866F,
				-9.5031F, 0.2964F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4816F, -0.2683F, -0.0111F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone106 = bone.addOrReplaceChild("bone106", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7696F, -8.2702F, 0.5051F, 0.2468F, 0.0407F, -0.0893F));
		PartDefinition bone108 = bone106.addOrReplaceChild("bone108", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8793F, -0.5543F, 8.4949F, 0.0038F, 0.0435F, 1.7454F));
		PartDefinition bone108_r1 = bone108.addOrReplaceChild("bone108_r1", CubeListBuilder.create().texOffs(26, 270).addBox(-9.6217F, -3.0128F, 0.6503F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4717F, -0.0195F, -0.361F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone108_r2 = bone108.addOrReplaceChild("bone108_r2", CubeListBuilder.create().texOffs(0, 271).addBox(-9.5408F, -3.0128F, 3.3458F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0674F, -0.0195F, -0.361F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone108_r3 = bone108.addOrReplaceChild("bone108_r3", CubeListBuilder.create().texOffs(6, 269).addBox(-3.6378F, -3.0128F, -9.6755F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(28, 269).addBox(-2.0205F,
				-3.0128F, -9.6755F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2246F, -0.0544F, -0.2309F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone108_r4 = bone108.addOrReplaceChild("bone108_r4",
				CubeListBuilder.create().texOffs(12, 270).addBox(-4.5363F, -3.0128F, -9.4239F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(30, 269)
						.addBox(-2.919F, -3.0128F, -9.5497F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(32, 268).addBox(-1.3017F, -3.0128F, -9.5497F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3145F, -0.0777F, -0.1441F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone108_r5 = bone108.addOrReplaceChild("bone108_r5", CubeListBuilder.create().texOffs(0, 271).addBox(-9.5408F, -3.0128F, 4.2443F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6398F, -0.0195F, -0.361F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone108_r6 = bone108.addOrReplaceChild("bone108_r6", CubeListBuilder.create().texOffs(0, 271).addBox(-9.5408F, -3.0128F, 3.3458F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5499F, -0.0195F, -0.361F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone108_r7 = bone108.addOrReplaceChild("bone108_r7", CubeListBuilder.create().texOffs(0, 271).addBox(-9.5408F, -3.0128F, 1.998F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0108F, -0.0195F, -0.361F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone109 = bone106.addOrReplaceChild("bone109", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5658F, 3.0069F, 8.1261F, 0.0F, 0.0436F, 1.6581F));
		PartDefinition bone109_r1 = bone109.addOrReplaceChild("bone109_r1", CubeListBuilder.create().texOffs(24, 270).addBox(-9.5751F, -3.1866F, 0.6412F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.356F, -0.2101F, -0.2281F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone109_r2 = bone109.addOrReplaceChild("bone109_r2", CubeListBuilder.create().texOffs(38, 273).addBox(-3.6287F, -3.1867F, -9.629F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(18, 269).addBox(-2.0114F,
				-3.1867F, -9.629F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2256F, -0.245F, -0.0979F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone109_r3 = bone109.addOrReplaceChild("bone109_r3", CubeListBuilder.create().texOffs(0, 271).addBox(-9.4942F, -3.1866F, 4.2352F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1896F, -0.2101F, -0.2281F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone109_r4 = bone109.addOrReplaceChild("bone109_r4", CubeListBuilder.create().texOffs(0, 271).addBox(-9.4942F, -3.1866F, 3.3367F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0997F, -0.2101F, -0.2281F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone109_r5 = bone109.addOrReplaceChild("bone109_r5", CubeListBuilder.create().texOffs(0, 271).addBox(-9.4942F, -3.1866F, 1.989F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5606F, -0.2101F, -0.2281F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone109_r6 = bone109.addOrReplaceChild("bone109_r6", CubeListBuilder.create().texOffs(38, 266).addBox(-4.5272F, -3.1866F, -9.5031F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(36, 270).addBox(-2.9099F,
				-3.1866F, -9.5031F, 0.2964F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4816F, -0.2683F, -0.0111F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone40 = bone.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6229F, -8.7761F, 8.5976F, -0.7632F, 0.0723F, 0.3038F));
		PartDefinition bone40_r1 = bone40.addOrReplaceChild("bone40_r1", CubeListBuilder.create().texOffs(80, 127).addBox(-3.1953F, 9.3565F, -2.3706F, 2.1123F, 0.8541F, 3.4131F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8285F, -0.8099F, -2.1071F, -1.0689F, -0.8752F, 0.6943F));
		PartDefinition bone40_r2 = bone40.addOrReplaceChild("bone40_r2", CubeListBuilder.create().texOffs(64, 94).addBox(-3.1955F, 19.9502F, 9.9843F, 0.7155F, 0.7791F, 5.3133F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9454F, -16.8386F, -6.4995F, -0.6F, 0.0993F, -0.3236F));
		PartDefinition bone53 = bone.addOrReplaceChild("bone53", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6229F, -8.7761F, 8.5976F, -0.7632F, -0.0723F, -0.3038F));
		PartDefinition bone41_r12 = bone53.addOrReplaceChild("bone41_r12", CubeListBuilder.create().texOffs(80, 127).mirror().addBox(1.083F, 9.3565F, -2.3706F, 2.1123F, 0.8541F, 3.4131F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8285F, -0.8099F, -2.1071F, -1.0689F, 0.8752F, -0.6943F));
		PartDefinition bone41_r13 = bone53.addOrReplaceChild("bone41_r13", CubeListBuilder.create().texOffs(64, 94).mirror().addBox(2.48F, 19.9502F, 9.9843F, 0.7155F, 0.7791F, 5.3133F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9454F, -16.8386F, -6.4995F, -0.6F, -0.0993F, 0.3236F));
		PartDefinition bone56 = bone.addOrReplaceChild("bone56", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4137F, -13.056F, 5.8565F, -1.2528F, -1.5168F, -0.1867F));
		PartDefinition bone56_r1 = bone56.addOrReplaceChild("bone56_r1", CubeListBuilder.create().texOffs(0, 271).addBox(-0.4798F, 0.0936F, 8.6374F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0674F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone56_r2 = bone56.addOrReplaceChild("bone56_r2", CubeListBuilder.create().texOffs(24, 269).addBox(-9.154F, 0.0936F, -0.1293F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(27, 272).addBox(-10.7713F, 0.0936F,
				-0.1293F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2246F, -0.0544F, 0.2309F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone56_r3 = bone56.addOrReplaceChild("bone56_r3",
				CubeListBuilder.create().texOffs(24, 274).addBox(-8.2555F, 0.0936F, -0.2551F, 1.0514F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(26, 269)
						.addBox(-9.8728F, 0.0936F, -0.2551F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(28, 268).addBox(-11.4901F, 0.0936F, -0.2551F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3145F, -0.0777F, 0.1441F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone56_r4 = bone56.addOrReplaceChild("bone56_r4", CubeListBuilder.create().texOffs(0, 271).addBox(-0.4797F, 0.0936F, 7.7389F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6398F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone56_r5 = bone56.addOrReplaceChild("bone56_r5", CubeListBuilder.create().texOffs(0, 271).addBox(-0.4798F, 0.0936F, 8.6374F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5499F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone56_r6 = bone56.addOrReplaceChild("bone56_r6", CubeListBuilder.create().texOffs(0, 271).addBox(-0.4798F, 0.0936F, 9.9851F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0108F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone56_r7 = bone56.addOrReplaceChild("bone56_r7", CubeListBuilder.create().texOffs(2, 270).addBox(-9.9078F, 2.1442F, -0.1608F, 0.548F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9595F, -0.0512F, 0.0393F, -0.2559F, 0.056F, 0.211F));
		PartDefinition bone52 = bone.addOrReplaceChild("bone52", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4137F, -13.056F, 5.8565F, -1.2528F, 1.5168F, 0.1867F));
		PartDefinition bone52_r1 = bone52.addOrReplaceChild("bone52_r1", CubeListBuilder.create().texOffs(0, 271).addBox(0.0034F, 0.0936F, 8.6374F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0674F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone52_r2 = bone52.addOrReplaceChild("bone52_r2", CubeListBuilder.create().texOffs(20, 269).addBox(8.4801F, 0.0936F, -0.1293F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(22, 268).addBox(10.0974F, 0.0936F,
				-0.1293F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2246F, -0.0544F, 0.2309F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone52_r3 = bone52.addOrReplaceChild("bone52_r3",
				CubeListBuilder.create().texOffs(20, 267).addBox(7.2041F, 0.0936F, -0.2551F, 1.0514F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(22, 269)
						.addBox(9.1989F, 0.0936F, -0.2551F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(24, 268).addBox(10.8162F, 0.0936F, -0.2551F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3145F, -0.0777F, 0.1441F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone52_r4 = bone52.addOrReplaceChild("bone52_r4", CubeListBuilder.create().texOffs(0, 271).addBox(0.0034F, 0.0936F, 7.7389F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6398F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone52_r5 = bone52.addOrReplaceChild("bone52_r5", CubeListBuilder.create().texOffs(0, 271).addBox(0.0034F, 0.0936F, 8.6374F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5499F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone52_r6 = bone52.addOrReplaceChild("bone52_r6", CubeListBuilder.create().texOffs(0, 271).addBox(0.0034F, 0.0936F, 9.9851F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0108F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone52_r7 = bone52.addOrReplaceChild("bone52_r7", CubeListBuilder.create().texOffs(0, 270).addBox(9.3598F, 2.1442F, -0.1608F, 0.548F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9595F, -0.0512F, 0.0393F, -0.2559F, -0.056F, -0.211F));
		PartDefinition bone16 = bone.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3309F, -12.9377F, -6.3962F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone35 = bone16.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2811F, 3.5324F, 9.8062F, 0.7632F, -0.0723F, 0.2166F));
		PartDefinition bone35_r1 = bone35.addOrReplaceChild("bone35_r1", CubeListBuilder.create().texOffs(8, 255).addBox(1.4053F, -10.1394F, 2.6285F, 1.6344F, 0.7118F, 0.7993F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3408F, -1.5964F, 2.6898F, 1.5225F, 0.9734F, 1.2565F));
		PartDefinition bone35_r2 = bone35.addOrReplaceChild("bone35_r2", CubeListBuilder.create().texOffs(14, 94).addBox(1.6743F, -10.1317F, -1.1581F, 1.7603F, 0.704F, 4.8891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3571F, -0.6749F, 1.7559F, 1.0689F, 0.8752F, 0.6943F));
		PartDefinition bone35_r3 = bone35.addOrReplaceChild("bone35_r3", CubeListBuilder.create().texOffs(84, 212).addBox(-0.0679F, -10.3282F, -1.4591F, 1.4707F, 1.0893F, 2.1207F, new CubeDeformation(0.0F)).texOffs(46, 162).addBox(-1.3263F,
				-10.3282F, -1.8762F, 1.3827F, 1.0893F, 3.167F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0787F, 0.8716F, -0.9602F, 0.7395F, -0.5851F, -0.7225F));
		PartDefinition bone35_r4 = bone35.addOrReplaceChild("bone35_r4", CubeListBuilder.create().texOffs(74, 257).addBox(-0.6914F, -0.5446F, 0.7925F, 1.3827F, 1.0893F, 0.791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0869F, -6.3253F, -8.1839F, 1.1618F, -0.9118F, -1.3252F));
		PartDefinition bone35_r5 = bone35.addOrReplaceChild("bone35_r5", CubeListBuilder.create().texOffs(40, 109).addBox(-0.1182F, -10.3282F, -4.22F, 1.8861F, 1.0893F, 4.1095F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7982F, -0.3709F, 0.4829F, 0.5966F, 0.0089F, -0.2498F));
		PartDefinition bone70 = bone16.addOrReplaceChild("bone70", CubeListBuilder.create(), PartPose.offset(-0.3597F, 5.5868F, 9.1377F));
		PartDefinition bone59 = bone70.addOrReplaceChild("bone59", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, -0.201F, -1.4286F));
		PartDefinition bone59_r1 = bone59.addOrReplaceChild("bone59_r1", CubeListBuilder.create().texOffs(18, 268).addBox(-1.1113F, 2.5992F, -9.4805F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2256F, -0.245F, 0.0979F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone59_r2 = bone59.addOrReplaceChild("bone59_r2", CubeListBuilder.create().texOffs(0, 271).addBox(-9.8309F, 2.5992F, -0.3038F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1896F, -0.2102F, 0.2281F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone59_r3 = bone59.addOrReplaceChild("bone59_r3", CubeListBuilder.create().texOffs(0, 271).addBox(-9.8309F, 2.5992F, 0.5947F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9237F, -0.2102F, 0.2281F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone59_r4 = bone59.addOrReplaceChild("bone59_r4", CubeListBuilder.create().texOffs(4, 270).addBox(-0.0368F, 2.5992F, -9.6063F, 0.4979F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4816F, -0.2683F, 0.0111F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone39 = bone70.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1279F, -3.6037F, 0.5353F, -0.0344F, -0.2048F, -1.5176F));
		PartDefinition bone39_r1 = bone39.addOrReplaceChild("bone39_r1", CubeListBuilder.create().texOffs(34, 270).addBox(-9.8768F, 2.4281F, 3.3275F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4717F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone39_r2 = bone39.addOrReplaceChild("bone39_r2", CubeListBuilder.create().texOffs(36, 270).addBox(-9.8768F, 2.4281F, 0.6321F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0674F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone39_r3 = bone39.addOrReplaceChild("bone39_r3", CubeListBuilder.create().texOffs(14, 268).addBox(-1.1487F, 2.4281F, -9.5263F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(14, 269).addBox(-2.766F, 2.4281F,
				-9.5263F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2246F, -0.0544F, 0.2309F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone39_r4 = bone39.addOrReplaceChild("bone39_r4",
				CubeListBuilder.create().texOffs(10, 270).addBox(-0.2502F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).texOffs(16, 268)
						.addBox(-1.8675F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).texOffs(16, 269).addBox(-3.4848F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3145F, -0.0777F, 0.1441F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone39_r5 = bone39.addOrReplaceChild("bone39_r5", CubeListBuilder.create().texOffs(36, 270).addBox(-9.8768F, 2.4281F, -0.2664F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6398F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone39_r6 = bone39.addOrReplaceChild("bone39_r6", CubeListBuilder.create().texOffs(36, 270).addBox(-9.8768F, 2.4281F, 0.6321F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5499F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone39_r7 = bone39.addOrReplaceChild("bone39_r7", CubeListBuilder.create().texOffs(0, 271).addBox(-9.8768F, 2.4281F, 1.9798F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0108F, -0.0195F, 0.361F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone10 = bone.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3309F, -12.9377F, -6.3962F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone14 = bone10.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2811F, 3.5324F, 9.8062F, 0.7632F, 0.0723F, -0.2166F));
		PartDefinition bone36_r1 = bone14.addOrReplaceChild("bone36_r1", CubeListBuilder.create().texOffs(8, 255).mirror().addBox(-3.0397F, -10.1394F, 2.6285F, 1.6344F, 0.7118F, 0.7993F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3408F, -1.5964F, 2.6898F, 1.5225F, -0.9734F, -1.2565F));
		PartDefinition bone36_r2 = bone14.addOrReplaceChild("bone36_r2", CubeListBuilder.create().texOffs(14, 94).mirror().addBox(-3.4345F, -10.1317F, -1.1581F, 1.7603F, 0.704F, 4.8891F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3571F, -0.6749F, 1.7559F, 1.0689F, -0.8752F, -0.6943F));
		PartDefinition bone36_r3 = bone14.addOrReplaceChild("bone36_r3", CubeListBuilder.create().texOffs(84, 212).mirror().addBox(-1.4029F, -10.3282F, -1.4591F, 1.4707F, 1.0893F, 2.1207F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 162)
				.mirror().addBox(-0.0565F, -10.3282F, -1.8762F, 1.3827F, 1.0893F, 3.167F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 0.8716F, -0.9602F, 0.7395F, 0.5851F, 0.7225F));
		PartDefinition bone36_r4 = bone14.addOrReplaceChild("bone36_r4", CubeListBuilder.create().texOffs(74, 257).mirror().addBox(-0.6914F, -0.5446F, 0.7925F, 1.3827F, 1.0893F, 0.791F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0869F, -6.3253F, -8.1839F, 1.1618F, 0.9118F, 1.3252F));
		PartDefinition bone36_r5 = bone14.addOrReplaceChild("bone36_r5", CubeListBuilder.create().texOffs(40, 109).mirror().addBox(-1.7679F, -10.3282F, -4.22F, 1.8861F, 1.0893F, 4.1095F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7982F, -0.3709F, 0.4829F, 0.5966F, -0.0089F, 0.2498F));
		PartDefinition bone37 = bone10.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offset(0.3597F, 5.5868F, 9.1377F));
		PartDefinition bone38 = bone37.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.201F, 1.4286F));
		PartDefinition bone60_r1 = bone38.addOrReplaceChild("bone60_r1", CubeListBuilder.create().texOffs(18, 268).mirror().addBox(0.4375F, 2.5992F, -9.4805F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2256F, -0.245F, 0.0979F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone60_r2 = bone38.addOrReplaceChild("bone60_r2", CubeListBuilder.create().texOffs(0, 271).mirror().addBox(9.3546F, 2.5992F, -0.3038F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1896F, -0.2102F, 0.2281F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone60_r3 = bone38.addOrReplaceChild("bone60_r3", CubeListBuilder.create().texOffs(0, 271).mirror().addBox(9.3546F, 2.5992F, 0.5947F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9237F, -0.2102F, 0.2281F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone60_r4 = bone38.addOrReplaceChild("bone60_r4", CubeListBuilder.create().texOffs(4, 270).mirror().addBox(-0.461F, 2.5992F, -9.6063F, 0.4979F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4816F, -0.2683F, 0.0111F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone44 = bone37.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1279F, -3.6037F, 0.5353F, -0.0344F, 0.2048F, 1.5176F));
		PartDefinition bone40_r3 = bone44.addOrReplaceChild("bone40_r3", CubeListBuilder.create().texOffs(34, 270).mirror().addBox(9.3195F, 2.4281F, 3.3275F, 0.5572F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4717F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone40_r4 = bone44.addOrReplaceChild("bone40_r4", CubeListBuilder.create().texOffs(36, 270).mirror().addBox(9.4005F, 2.4281F, 0.6321F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0674F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone40_r5 = bone44.addOrReplaceChild("bone40_r5", CubeListBuilder.create().texOffs(14, 268).mirror().addBox(0.4748F, 2.4281F, -9.5263F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 269)
				.mirror().addBox(2.0921F, 2.4281F, -9.5263F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2246F, -0.0544F, 0.2309F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone40_r6 = bone44.addOrReplaceChild("bone40_r6",
				CubeListBuilder.create().texOffs(10, 270).mirror().addBox(-0.4237F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 268).mirror()
						.addBox(1.1936F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 269).mirror().addBox(2.8109F, 2.4281F, -9.6522F, 0.6739F, 1.1231F, 0.2606F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.3145F, -0.0777F, 0.1441F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone40_r7 = bone44.addOrReplaceChild("bone40_r7", CubeListBuilder.create().texOffs(36, 270).mirror().addBox(9.4005F, 2.4281F, -0.2664F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6398F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone40_r8 = bone44.addOrReplaceChild("bone40_r8", CubeListBuilder.create().texOffs(36, 270).mirror().addBox(9.4005F, 2.4281F, 0.6321F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5499F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone40_r9 = bone44.addOrReplaceChild("bone40_r9", CubeListBuilder.create().texOffs(0, 271).mirror().addBox(9.4005F, 2.4281F, 1.9798F, 0.4763F, 1.1231F, 0.1348F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0108F, -0.0195F, 0.361F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition Breast = UpperBody.addOrReplaceChild("Breast", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5478F, -1.4228F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Breast_r1 = Breast.addOrReplaceChild("Breast_r1", CubeListBuilder.create().texOffs(0, 237).addBox(-0.3253F, -0.2358F, -0.2439F, 3.2525F, 0.4716F, 0.4879F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.301F, -3.2348F, -0.6505F, 1.0908F, 0.0F, 0.0F));
		PartDefinition Breast_r2 = Breast.addOrReplaceChild("Breast_r2", CubeListBuilder.create().texOffs(52, 104).addBox(-0.8131F, -2.2586F, -1.6238F, 1.6262F, 3.5011F, 3.4151F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2071F, -0.1216F, 1.0036F, 0.0F, 0.0F));
		PartDefinition Breast_r3 = Breast.addOrReplaceChild("Breast_r3", CubeListBuilder.create().texOffs(84, 72).addBox(-1.6741F, -1.4636F, -1.7563F, 3.1377F, 3.306F, 3.5452F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4274F, -0.6624F, -0.4911F, 1.0322F, 0.1509F, 0.2429F));
		PartDefinition Breast_r4 = Breast.addOrReplaceChild("Breast_r4", CubeListBuilder.create().texOffs(32, 217).addBox(0.1626F, -1.2197F, -1.0164F, 1.6262F, 2.7646F, 1.3823F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9757F, -2.1431F, 0.1487F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Breast_r5 = Breast.addOrReplaceChild("Breast_r5", CubeListBuilder.create().texOffs(90, 123).addBox(0.4879F, -2.2586F, -1.7051F, 0.7318F, 3.5011F, 3.4151F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1785F, 0.1798F, -0.1042F, 1.0053F, -0.0468F, -0.0737F));
		PartDefinition Breast_r6 = Breast.addOrReplaceChild("Breast_r6", CubeListBuilder.create().texOffs(0, 131).addBox(-1.2197F, -2.2586F, -1.7051F, 0.7318F, 3.5011F, 3.4151F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1785F, 0.1798F, -0.1042F, 1.0053F, 0.0468F, 0.0737F));
		PartDefinition Breast_r7 = Breast.addOrReplaceChild("Breast_r7", CubeListBuilder.create().texOffs(98, 72).addBox(-1.4636F, -1.4636F, -1.7563F, 3.1377F, 3.306F, 3.5452F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4274F, -0.6624F, -0.4911F, 1.0322F, -0.1509F, -0.2429F));
		PartDefinition Arm = UpperBody.addOrReplaceChild("Arm", CubeListBuilder.create(), PartPose.offset(0.0F, -3.08F, 0.0F));
		PartDefinition shang_ban_shen_middle = UpperBody.addOrReplaceChild("shang_ban_shen_middle", CubeListBuilder.create().texOffs(48, 25).addBox(-4.3641F, -3.5777F, -1.9515F, 8.7549F, 3.2525F, 3.903F, new CubeDeformation(0.0F)).texOffs(20, 51)
				.addBox(-4.1689F, -4.5535F, -1.7889F, 8.3379F, 0.9757F, 3.5777F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.3351F, 0.0F));
		PartDefinition DownBody = AllBody.addOrReplaceChild("DownBody",
				CubeListBuilder.create().texOffs(44, 51).addBox(-4.5209F, -0.9462F, -1.3823F, 9.0419F, 0.9757F, 2.7646F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-1.6262F, 3.2821F, -1.9515F, 3.2525F, 1.6262F, 3.903F, new CubeDeformation(0.0F)).texOffs(20, 26).addBox(-4.8787F, 0.0296F, -1.984F, 9.7574F, 3.2525F, 3.968F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DownBody_r1 = DownBody.addOrReplaceChild("DownBody_r1", CubeListBuilder.create().texOffs(42, 84).addBox(-1.6262F, -0.8131F, -1.9515F, 2.9272F, 1.6262F, 3.903F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4214F, 3.2732F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition DownBody_r2 = DownBody.addOrReplaceChild("DownBody_r2", CubeListBuilder.create().texOffs(56, 84).addBox(-1.301F, -0.8131F, -1.9515F, 2.9272F, 1.6262F, 3.903F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4214F, 3.2732F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition Chang_qun = DownBody.addOrReplaceChild("Chang_qun", CubeListBuilder.create(), PartPose.offset(0.0134F, 0.2422F, -0.3787F));
		PartDefinition Chang_qun_front = Chang_qun.addOrReplaceChild("Chang_qun_front", CubeListBuilder.create(), PartPose.offset(0.1595F, 0.1771F, -1.2584F));
		PartDefinition Chang_qun_front_r1 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r1", CubeListBuilder.create().texOffs(64, 237).addBox(-0.6768F, -0.2499F, -0.3376F, 1.3536F, 3.3384F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4352F, 0.0F, 0.0F, -0.4624F, 0.6497F, -0.1624F));
		PartDefinition Chang_qun_front_r2 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r2", CubeListBuilder.create().texOffs(68, 237).addBox(-0.6768F, -0.2499F, -0.3376F, 1.3536F, 3.3384F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1162F, 0.0F, 0.0F, -0.4624F, -0.6497F, 0.1624F));
		PartDefinition Chang_qun_front_r3 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r3", CubeListBuilder.create().texOffs(20, 141).addBox(-0.4521F, -4.5182F, -0.4204F, 1.3536F, 9.4589F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0513F, 3.8872F, -1.8708F, -0.3914F, 0.0334F, 0.0807F));
		PartDefinition Chang_qun_front_r4 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r4", CubeListBuilder.create().texOffs(24, 141).addBox(-0.9015F, -4.5182F, -0.4204F, 1.3536F, 9.4589F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7323F, 3.8872F, -1.8708F, -0.3914F, -0.0334F, -0.0807F));
		PartDefinition Chang_qun_front_r5 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r5", CubeListBuilder.create().texOffs(40, 61).addBox(-3.4679F, -0.1993F, -0.4207F, 6.9801F, 9.5477F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1817F, -0.1297F, -0.2069F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Chang_qun_front_r6 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r6", CubeListBuilder.create().texOffs(0, 72).addBox(-4.3944F, 7.8342F, -0.4111F, 8.8052F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1677F, 2.0431F, 0.6856F, -0.6109F, 0.0F, 0.0F));
		PartDefinition bone89 = Chang_qun_front.addOrReplaceChild("bone89", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.202F, 11.3554F, -5.9671F, -0.457F, 0.5433F, -0.0858F));
		PartDefinition bone89_r1 = bone89.addOrReplaceChild("bone89_r1", CubeListBuilder.create().texOffs(36, 269).addBox(0.4435F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4477F, -0.1631F, 2.3832F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone89_r2 = bone89.addOrReplaceChild("bone89_r2", CubeListBuilder.create().texOffs(54, 264).addBox(-3.1046F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0887F, -0.2779F, 1.9548F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone89_r3 = bone89.addOrReplaceChild("bone89_r3", CubeListBuilder.create().texOffs(40, 260).addBox(-0.4435F, -0.887F, -0.4435F, 1.6854F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0243F, -0.232F, 2.1262F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone85 = Chang_qun_front.addOrReplaceChild("bone85", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1004F, 11.3554F, -5.9671F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone85_r1 = bone85.addOrReplaceChild("bone85_r1", CubeListBuilder.create().texOffs(36, 269).addBox(-0.887F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7002F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone85_r2 = bone85.addOrReplaceChild("bone85_r2", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6357F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone85_r3 = bone85.addOrReplaceChild("bone85_r3",
				CubeListBuilder.create().texOffs(32, 267).addBox(5.3222F, -0.887F, -0.4435F, 0.6209F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(0, 265)
						.addBox(2.1289F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(0, 266).addBox(-1.0645F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5671F, 0.3175F, 0.3282F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone85_r4 = bone85.addOrReplaceChild("bone85_r4",
				CubeListBuilder.create().texOffs(52, 264).addBox(3.5482F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(0, 267)
						.addBox(0.3548F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(54, 263).addBox(-2.8385F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3897F, 0.2716F, 0.1568F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone85_r5 = bone85.addOrReplaceChild("bone85_r5", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -4.5683F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8131F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone85_r6 = bone85.addOrReplaceChild("bone85_r6", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -4.5683F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0065F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone85_r7 = bone85.addOrReplaceChild("bone85_r7", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8291F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone85_r8 = bone85.addOrReplaceChild("bone85_r8", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -0.887F, -0.1331F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7646F, 0.3864F, 0.5852F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone87 = Chang_qun_front.addOrReplaceChild("bone87", CubeListBuilder.create(), PartPose.offsetAndRotation(7.883F, 11.3554F, -5.9671F, -0.457F, -0.5433F, 0.0858F));
		PartDefinition bone87_r1 = bone87.addOrReplaceChild("bone87_r1", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3832F, -0.1631F, 2.3832F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone87_r2 = bone87.addOrReplaceChild("bone87_r2", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4477F, -0.1631F, 2.3832F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone87_r3 = bone87.addOrReplaceChild("bone87_r3", CubeListBuilder.create().texOffs(50, 264).addBox(1.7741F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0887F, -0.232F, 2.1262F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone87_r4 = bone87.addOrReplaceChild("bone87_r4", CubeListBuilder.create().texOffs(52, 263).addBox(-0.887F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0243F, -0.2779F, 1.9548F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Chang_qun_left = Chang_qun.addOrReplaceChild("Chang_qun_left", CubeListBuilder.create(), PartPose.offset(4.4793F, 0.6898F, -0.0868F));
		PartDefinition Chang_qun_left_r1 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r1", CubeListBuilder.create().texOffs(44, 246).addBox(-0.915F, -3.1787F, -0.6045F, 0.9429F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4352F, 11.088F, 0.0F, -3.0438F, 1.5565F, 2.8228F));
		PartDefinition Chang_qun_left_r2 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r2", CubeListBuilder.create().texOffs(106, 212).addBox(-1.3585F, -3.1787F, -0.3384F, 2.5396F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0798F, 11.1485F, 1.6902F, 0.393F, 1.3498F, -0.0146F));
		PartDefinition Chang_qun_front_r7 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r7",
				CubeListBuilder.create().texOffs(22, 255).mirror().addBox(-0.334F, -2.1079F, -0.4111F, 0.6768F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.155F, 9.6528F, -6.1734F, -0.6091F, 0.05F, 0.0715F));
		PartDefinition Chang_qun_front_r8 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r8",
				CubeListBuilder.create().texOffs(0, 178).mirror().addBox(-0.6768F, -3.4876F, -0.3384F, 1.1762F, 8.3945F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.0139F, 3.4122F, -2.8933F, -0.4912F, 0.6297F, -0.2108F));
		PartDefinition Chang_qun_front_r9 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r9",
				CubeListBuilder.create().texOffs(12, 203).mirror().addBox(-0.6768F, -2.1571F, -0.3293F, 1.3536F, 6.1769F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.5962F, 4.2857F, -2.83F, -0.366F, 0.7025F, -0.0088F));
		PartDefinition Chang_qun_front_r10 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r10",
				CubeListBuilder.create().texOffs(72, 237).mirror().addBox(-0.7819F, -3.3118F, -0.3385F, 1.3864F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.79F, 10.527F, -6.5012F, -0.7451F, 0.5685F, -0.3545F));
		PartDefinition Chang_qun_front_r11 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r11",
				CubeListBuilder.create().texOffs(52, 241).mirror().addBox(-0.5158F, -3.2674F, -0.3384F, 1.2977F, 3.0754F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.5868F, 10.8565F, -5.1153F, -0.5485F, 0.6578F, -0.0349F));
		PartDefinition Chang_qun_front_r12 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r12",
				CubeListBuilder.create().texOffs(80, 251).mirror().addBox(-0.7819F, -2.6465F, -0.3384F, 0.8986F, 2.7205F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.3349F, 10.5506F, -5.9868F, -0.5876F, 0.7313F, -0.096F));
		PartDefinition Chang_qun_left_r3 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r3",
				CubeListBuilder.create().texOffs(38, 241).mirror().addBox(-0.6489F, -3.1787F, -0.3384F, 1.2977F, 3.1641F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.0426F, 10.8832F, -4.3104F, -1.1145F, 1.0932F, -0.7434F));
		PartDefinition Chang_qun_front_r13 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r13", CubeListBuilder.create().texOffs(22, 255).addBox(-0.3428F, -2.1079F, -0.4111F, 0.6768F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1965F, 9.6528F, -6.1734F, -0.6091F, -0.05F, -0.0715F));
		PartDefinition Chang_qun_front_r14 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r14", CubeListBuilder.create().texOffs(0, 178).addBox(-0.4994F, -3.4876F, -0.3384F, 1.1762F, 8.3945F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0553F, 3.4122F, -2.8933F, -0.4912F, -0.6297F, 0.2108F));
		PartDefinition Chang_qun_front_r15 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r15", CubeListBuilder.create().texOffs(12, 203).addBox(-0.6768F, -2.1571F, -0.3293F, 1.3536F, 6.1769F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6377F, 4.2857F, -2.83F, -0.366F, -0.7025F, 0.0088F));
		PartDefinition Chang_qun_front_r16 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r16", CubeListBuilder.create().texOffs(72, 237).addBox(-0.6045F, -3.3118F, -0.3385F, 1.3864F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8315F, 10.527F, -6.5012F, -0.7451F, -0.5685F, 0.3545F));
		PartDefinition Chang_qun_front_r17 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r17", CubeListBuilder.create().texOffs(52, 241).addBox(-0.7819F, -3.2674F, -0.3384F, 1.2977F, 3.0754F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6283F, 10.8565F, -5.1153F, -0.5485F, -0.6578F, 0.0349F));
		PartDefinition Chang_qun_front_r18 = Chang_qun_left.addOrReplaceChild("Chang_qun_front_r18", CubeListBuilder.create().texOffs(80, 251).addBox(-0.1166F, -2.6465F, -0.3384F, 0.8986F, 2.7205F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3764F, 10.5506F, -5.9868F, -0.5876F, -0.7313F, 0.096F));
		PartDefinition Chang_qun_left_r4 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r4", CubeListBuilder.create().texOffs(38, 241).addBox(-0.6489F, -3.1787F, -0.3384F, 1.2977F, 3.1641F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0841F, 10.8832F, -4.3104F, -1.1145F, -1.0932F, 0.7434F));
		PartDefinition Chang_qun_left_r5 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r5", CubeListBuilder.create().texOffs(84, 229).addBox(0.9035F, -3.2674F, -0.3384F, 1.83F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0347F, 10.9125F, -4.5861F, -0.8049F, -1.2743F, 0.4108F));
		PartDefinition Chang_qun_left_r6 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r6", CubeListBuilder.create().texOffs(0, 217).addBox(-1.3585F, -3.1787F, -0.3384F, 2.5396F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9911F, 11.1485F, -0.8183F, -0.393F, -1.3498F, -0.0146F));
		PartDefinition Chang_qun_left_r7 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r7", CubeListBuilder.create().texOffs(62, 187).addBox(-0.6768F, -3.0441F, -0.339F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4825F, 4.6322F, -1.3882F, -0.3446F, -1.2977F, 0.0481F));
		PartDefinition Chang_qun_left_r8 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r8", CubeListBuilder.create().texOffs(80, 261).addBox(-0.4107F, -0.4717F, -0.3384F, 1.1762F, 0.5886F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2591F, -0.1977F, -0.6089F, -0.8569F, -1.1886F, 0.5506F));
		PartDefinition Chang_qun_left_r9 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r9", CubeListBuilder.create().texOffs(32, 261).addBox(-0.4107F, 0.0605F, -0.3384F, 1.1762F, 1.1208F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2721F, -0.1866F, -0.6156F, -0.7347F, -1.1886F, 0.5506F));
		PartDefinition Chang_qun_left_r10 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r10", CubeListBuilder.create().texOffs(24, 178).addBox(-0.6768F, -3.8424F, -0.3384F, 1.4423F, 7.6849F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3023F, 4.5684F, -1.9684F, -0.822F, -1.1886F, 0.5506F));
		PartDefinition Chang_qun_left_r11 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r11", CubeListBuilder.create().texOffs(52, 255).addBox(-0.5881F, -0.9596F, -0.3384F, 0.8214F, 2.6287F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4018F, 0.1649F, 0.2809F, -1.5797F, -1.4795F, 1.3302F));
		PartDefinition Chang_qun_left_r12 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r12", CubeListBuilder.create().texOffs(16, 251).addBox(-0.6768F, -0.9596F, -0.3384F, 1.0875F, 2.6287F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4112F, 0.2056F, 0.5929F, 1.6321F, 1.4795F, 1.3302F));
		PartDefinition Chang_qun_left_r13 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r13", CubeListBuilder.create().texOffs(34, 178).addBox(-0.6768F, -3.4433F, -0.3384F, 1.7971F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8669F, 5.078F, 1.058F, 1.6146F, 1.4795F, 1.3302F));
		PartDefinition Chang_qun_left_r14 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r14", CubeListBuilder.create().texOffs(66, 187).addBox(-0.6768F, -3.4433F, -0.3384F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7782F, 5.078F, -0.1861F, -1.6146F, -1.4795F, 1.3302F));
		PartDefinition Chang_qun_left_r15 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r15", CubeListBuilder.create().texOffs(0, 278).addBox(-0.6768F, -3.0441F, -0.3384F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5712F, 4.6322F, 2.2601F, 0.3446F, 1.2977F, 0.0481F));
		PartDefinition Chang_qun_left_r16 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r16", CubeListBuilder.create().texOffs(76, 251).addBox(-0.6489F, -3.1787F, -0.3384F, 0.6768F, 3.1641F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1728F, 10.8832F, 5.1823F, 1.1145F, 1.0932F, 0.7434F));
		PartDefinition Chang_qun_left_r17 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r17", CubeListBuilder.create().texOffs(44, 207).addBox(0.2382F, -3.2674F, -0.3384F, 2.717F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1234F, 10.9125F, 5.458F, 0.8049F, 1.2743F, 0.4108F));
		PartDefinition Chang_qun_left_r18 = Chang_qun_left.addOrReplaceChild("Chang_qun_left_r18", CubeListBuilder.create().texOffs(56, 141).addBox(-0.6768F, -5.5278F, -0.3384F, 1.3536F, 9.3703F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.391F, 4.5684F, 2.8403F, 0.822F, 1.1886F, 0.5506F));
		PartDefinition bone95 = Chang_qun_left.addOrReplaceChild("bone95", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5789F, 10.8895F, 7.1127F, 0.7484F, 0.9823F, 0.4945F));
		PartDefinition bone95_r1 = bone95.addOrReplaceChild("bone95_r1", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.862F, -0.0138F, -1.9353F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone95_r2 = bone95.addOrReplaceChild("bone95_r2", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7976F, -0.0138F, -1.9353F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone95_r3 = bone95.addOrReplaceChild("bone95_r3", CubeListBuilder.create().texOffs(32, 263).addBox(1.7741F, -0.9757F, 0.1774F, 1.3306F, 1.4193F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1566F, -0.0827F, -1.6782F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone95_r4 = bone95.addOrReplaceChild("bone95_r4", CubeListBuilder.create().texOffs(50, 263).addBox(-0.887F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.221F, -0.1286F, -1.5069F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone97 = Chang_qun_left.addOrReplaceChild("bone97", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3329F, 11.977F, 3.4803F, 0.4214F, 1.3977F, 0.1014F));
		PartDefinition bone97_r1 = bone97.addOrReplaceChild("bone97_r1", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -1.0645F, -2.7942F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2892F, 0.0753F, -0.9122F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone97_r2 = bone97.addOrReplaceChild("bone97_r2", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -1.0645F, -0.133F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2247F, 0.0753F, -0.9122F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone97_r3 = bone97.addOrReplaceChild("bone97_r3", CubeListBuilder.create().texOffs(0, 255).addBox(-0.887F, -1.0645F, 1.3749F, 0.3548F, 1.508F, 1.4193F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0473F, 0.0753F, -0.9122F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone97_r4 = bone97.addOrReplaceChild("bone97_r4", CubeListBuilder.create().texOffs(12, 263).addBox(1.7741F, -1.0645F, 0.1774F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4163F, 0.0064F, -0.6552F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone97_r5 = bone97.addOrReplaceChild("bone97_r5", CubeListBuilder.create().texOffs(14, 263).addBox(-0.887F, -1.0645F, 0.1774F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6482F, -0.0395F, -0.4838F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone88 = Chang_qun_left.addOrReplaceChild("bone88", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3329F, 12.0002F, -2.7842F, -0.4214F, -1.3977F, 0.1014F));
		PartDefinition bone88_r1 = bone88.addOrReplaceChild("bone88_r1", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -1.0645F, 2.5281F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2892F, 0.0753F, 0.9122F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone88_r2 = bone88.addOrReplaceChild("bone88_r2", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -1.0645F, -0.133F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2247F, 0.0753F, 0.9122F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone88_r3 = bone88.addOrReplaceChild("bone88_r3", CubeListBuilder.create().texOffs(8, 263).addBox(1.7741F, -1.0645F, -0.4435F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4163F, 0.0064F, 0.6552F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone88_r4 = bone88.addOrReplaceChild("bone88_r4", CubeListBuilder.create().texOffs(10, 263).addBox(-0.887F, -1.0645F, -0.4435F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6482F, -0.0395F, 0.4838F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone86 = Chang_qun_left.addOrReplaceChild("bone86", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5789F, 10.9127F, -6.4167F, -0.7484F, -0.9823F, 0.4945F));
		PartDefinition bone86_r1 = bone86.addOrReplaceChild("bone86_r1", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.862F, -0.0138F, 1.9353F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone86_r2 = bone86.addOrReplaceChild("bone86_r2", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -0.1331F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7976F, -0.0138F, 1.9353F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition bone86_r3 = bone86.addOrReplaceChild("bone86_r3", CubeListBuilder.create().texOffs(28, 264).addBox(1.7741F, -0.9757F, -0.4435F, 1.3306F, 1.4193F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1566F, -0.0827F, 1.6782F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone86_r4 = bone86.addOrReplaceChild("bone86_r4", CubeListBuilder.create().texOffs(48, 264).addBox(-0.887F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.221F, -0.1286F, 1.5069F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Chang_qun_behind = Chang_qun.addOrReplaceChild("Chang_qun_behind", CubeListBuilder.create().texOffs(48, 18).addBox(-5.0084F, -0.3967F, -3.5281F, 9.6137F, 3.1676F, 3.8889F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1881F, 0.2212F, 2.0152F));
		PartDefinition Chang_qun_behind_r1 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r1", CubeListBuilder.create().texOffs(36, 259).addBox(0.2102F, -3.5763F, -0.3384F, 0.4666F, 2.54F, 0.6768F, new CubeDeformation(0.0F)).texOffs(74, 217)
				.mirror().addBox(-0.6768F, -1.0926F, -0.3384F, 1.3536F, 5.1125F, 0.6768F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0176F, 4.7543F, 1.5998F, 0.366F, 0.7025F, 0.0088F));
		PartDefinition Chang_qun_behind_r2 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r2", CubeListBuilder.create().texOffs(56, 67).addBox(-4.3936F, 7.6307F, -0.5564F, 9.2696F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4459F, 1.9312F, -0.5802F, 0.6109F, 0.0F, 0.0F));
		PartDefinition Chang_qun_behind_r3 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r3", CubeListBuilder.create().texOffs(42, 273).addBox(-0.6768F, -3.5763F, -0.3384F, 0.4666F, 2.54F, 0.6768F, new CubeDeformation(0.0F)).texOffs(74, 217)
				.addBox(-0.6768F, -1.0926F, -0.3384F, 1.3536F, 5.1125F, 0.6768F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3938F, 4.7543F, 1.5998F, 0.366F, -0.7025F, -0.0088F));
		PartDefinition Chang_qun_behind_r4 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r4",
				CubeListBuilder.create().texOffs(14, 255).mirror().addBox(-0.3251F, -2.3107F, -0.5564F, 0.6768F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5998F, 10.0632F, 5.114F, 0.6091F, 0.05F, -0.0715F));
		PartDefinition Chang_qun_behind_r5 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r5",
				CubeListBuilder.create().texOffs(26, 241).mirror().addBox(-0.5158F, -3.3118F, -0.3394F, 1.2977F, 3.1528F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.2114F, 10.9956F, 5.2711F, 0.7451F, 0.5685F, 0.3545F));
		PartDefinition Chang_qun_behind_r6 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r6",
				CubeListBuilder.create().texOffs(62, 255).mirror().addBox(0.0164F, -2.6465F, -0.3384F, 0.7655F, 2.7205F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.7563F, 11.0193F, 4.7567F, 0.5876F, 0.7313F, 0.096F));
		PartDefinition Chang_qun_behind_r7 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r7",
				CubeListBuilder.create().texOffs(44, 241).mirror().addBox(-0.7819F, -3.2674F, -0.3384F, 1.2977F, 3.0754F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.0082F, 11.3251F, 3.8851F, 0.5485F, 0.6578F, 0.0349F));
		PartDefinition Chang_qun_behind_r8 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r8",
				CubeListBuilder.create().texOffs(4, 168).mirror().addBox(-0.2333F, -4.1973F, -0.3375F, 0.9101F, 9.1041F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.4352F, 3.8808F, 1.6632F, 0.4912F, 0.6297F, 0.2108F));
		PartDefinition Chang_qun_behind_r9 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r9",
				CubeListBuilder.create().texOffs(42, 158).mirror().addBox(-0.291F, -4.6092F, -0.5843F, 0.9766F, 9.4146F, 0.6768F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.7861F, 3.831F, 2.0129F, 0.3914F, 0.0334F, -0.0807F));
		PartDefinition Chang_qun_behind_r10 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r10", CubeListBuilder.create().texOffs(14, 255).addBox(-0.3517F, -2.3107F, -0.5564F, 0.6768F, 2.9867F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.976F, 10.0632F, 5.114F, 0.6091F, -0.05F, 0.0715F));
		PartDefinition Chang_qun_behind_r11 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r11", CubeListBuilder.create().texOffs(26, 241).addBox(-0.7819F, -3.3118F, -0.3394F, 1.2977F, 3.1528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5876F, 10.9956F, 5.2711F, 0.7451F, -0.5685F, -0.3545F));
		PartDefinition Chang_qun_behind_r12 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r12", CubeListBuilder.create().texOffs(62, 255).addBox(-0.7819F, -2.6465F, -0.3384F, 0.7655F, 2.7205F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1325F, 11.0193F, 4.7567F, 0.5876F, -0.7313F, -0.096F));
		PartDefinition Chang_qun_behind_r13 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r13", CubeListBuilder.create().texOffs(44, 241).addBox(-0.5158F, -3.2674F, -0.3384F, 1.2977F, 3.0754F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3844F, 11.3251F, 3.8851F, 0.5485F, -0.6578F, -0.0349F));
		PartDefinition Chang_qun_behind_r14 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r14", CubeListBuilder.create().texOffs(4, 168).addBox(-0.6768F, -4.1973F, -0.3375F, 0.9101F, 9.1041F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8114F, 3.8808F, 1.6632F, 0.4912F, -0.6297F, -0.2108F));
		PartDefinition Chang_qun_behind_r15 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r15", CubeListBuilder.create().texOffs(42, 158).addBox(-0.6857F, -4.6092F, -0.5843F, 0.9766F, 9.4146F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1623F, 3.831F, 2.0129F, 0.3914F, -0.0334F, 0.0807F));
		PartDefinition Chang_qun_behind_r16 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r16", CubeListBuilder.create().texOffs(0, 51).addBox(-4.1332F, -0.2908F, -0.5841F, 8.5324F, 9.3259F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3046F, -0.1488F, 0.3644F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone99 = Chang_qun_behind.addOrReplaceChild("bone99", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2306F, 11.2882F, 5.7327F, 0.457F, -0.5433F, -0.0858F));
		PartDefinition bone99_r1 = bone99.addOrReplaceChild("bone99_r1", CubeListBuilder.create().texOffs(36, 269).addBox(0.4435F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4477F, -0.1631F, -2.3832F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone99_r2 = bone99.addOrReplaceChild("bone99_r2", CubeListBuilder.create().texOffs(48, 263).addBox(-3.1046F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0887F, -0.2779F, -1.9548F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone99_r3 = bone99.addOrReplaceChild("bone99_r3", CubeListBuilder.create().texOffs(40, 259).addBox(-0.4435F, -0.887F, 0.1774F, 1.6854F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0243F, -0.2319F, -2.1262F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone94 = Chang_qun_behind.addOrReplaceChild("bone94", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.129F, 11.2882F, 5.7327F, 0.48F, 0.0F, 0.0F));
		PartDefinition bone94_r1 = bone94.addOrReplaceChild("bone94_r1", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7002F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone94_r2 = bone94.addOrReplaceChild("bone94_r2", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6357F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone94_r3 = bone94.addOrReplaceChild(
				"bone94_r3", CubeListBuilder.create().texOffs(32, 266).addBox(5.3222F, -0.887F, 0.1774F, 0.6209F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(56, 263)
						.addBox(2.1289F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(56, 264).addBox(-1.0645F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5671F, 0.3175F, -0.3282F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone94_r4 = bone94.addOrReplaceChild(
				"bone94_r4", CubeListBuilder.create().texOffs(46, 263).addBox(3.5482F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(58, 263)
						.addBox(0.3548F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)).texOffs(46, 264).addBox(-2.8385F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3897F, 0.2716F, -0.1568F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone94_r5 = bone94.addOrReplaceChild("bone94_r5", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, 4.3021F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8131F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone94_r6 = bone94.addOrReplaceChild("bone94_r6", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, 4.3021F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0065F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone94_r7 = bone94.addOrReplaceChild("bone94_r7", CubeListBuilder.create().texOffs(0, 270).addBox(-0.887F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8291F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone94_r8 = bone94.addOrReplaceChild("bone94_r8", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7646F, 0.3864F, -0.5852F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone96 = Chang_qun_behind.addOrReplaceChild("bone96", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8544F, 11.2882F, 5.7327F, 0.457F, 0.5433F, 0.0858F));
		PartDefinition bone96_r1 = bone96.addOrReplaceChild("bone96_r1", CubeListBuilder.create().texOffs(36, 269).addBox(-0.887F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3832F, -0.1631F, -2.3832F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone96_r2 = bone96.addOrReplaceChild("bone96_r2", CubeListBuilder.create().texOffs(36, 268).addBox(-0.887F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4477F, -0.1631F, -2.3832F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition bone96_r3 = bone96.addOrReplaceChild("bone96_r3", CubeListBuilder.create().texOffs(44, 263).addBox(1.7741F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0887F, -0.2319F, -2.1262F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone96_r4 = bone96.addOrReplaceChild("bone96_r4", CubeListBuilder.create().texOffs(44, 264).addBox(-0.887F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0243F, -0.2779F, -1.9548F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Chang_qun_right = Chang_qun.addOrReplaceChild("Chang_qun_right", CubeListBuilder.create(), PartPose.offset(-4.8904F, 0.8954F, 0.5061F));
		PartDefinition Chang_qun_right_r1 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r1", CubeListBuilder.create().texOffs(11, 275).addBox(-0.4107F, -0.9596F, -0.3384F, 1.0875F, 2.6287F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6321F, -1.4795F, -1.3302F));
		PartDefinition Chang_qun_right_r2 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r2", CubeListBuilder.create().texOffs(48, 255).addBox(-0.2333F, -0.9596F, -0.3384F, 0.8214F, 2.6287F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0094F, -0.0407F, -0.312F, -1.5797F, 1.4795F, -1.3302F));
		PartDefinition Chang_qun_right_r3 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r3", CubeListBuilder.create().texOffs(80, 259).addBox(-0.7655F, -0.4717F, -0.3384F, 1.1762F, 0.5886F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.152F, -0.4033F, -1.2018F, -0.8569F, 1.1886F, -0.5506F));
		PartDefinition Chang_qun_right_r4 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r4", CubeListBuilder.create().texOffs(32, 259).addBox(-0.7655F, 0.0605F, -0.3384F, 1.1762F, 1.1208F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.139F, -0.3922F, -1.2085F, -0.7347F, 1.1886F, -0.5506F));
		PartDefinition Chang_qun_right_r5 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r5", CubeListBuilder.create().texOffs(20, 178).addBox(-0.7655F, -3.8424F, -0.3384F, 1.4423F, 7.6849F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8911F, 4.3628F, -2.5613F, -0.822F, 1.1886F, -0.5506F));
		PartDefinition Chang_qun_right_r6 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r6", CubeListBuilder.create().texOffs(50, 187).addBox(-0.6768F, -3.0441F, -0.339F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0713F, 4.4266F, -1.9811F, -0.3446F, 1.2977F, -0.0481F));
		PartDefinition Chang_qun_right_r7 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r7", CubeListBuilder.create().texOffs(54, 187).addBox(-0.6768F, -3.4433F, -0.3384F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.367F, 4.8723F, -0.779F, -1.6146F, 1.4795F, -1.3302F));
		PartDefinition Chang_qun_right_r8 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r8", CubeListBuilder.create().texOffs(28, 178).addBox(-1.1203F, -3.4433F, -0.3384F, 1.7971F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4557F, 4.8723F, 0.4651F, 1.6146F, -1.4795F, -1.3302F));
		PartDefinition Chang_qun_right_r9 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r9", CubeListBuilder.create().texOffs(58, 187).addBox(-0.6768F, -3.0441F, -0.3384F, 1.3536F, 6.8865F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.16F, 4.4266F, 1.6672F, 0.3446F, -1.2977F, -0.0481F));
		PartDefinition Chang_qun_right_r10 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r10", CubeListBuilder.create().texOffs(52, 141).addBox(-0.6768F, -5.5278F, -0.3384F, 1.3536F, 9.3703F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9798F, 4.3628F, 2.2474F, 0.822F, -1.1886F, -0.5506F));
		PartDefinition Chang_qun_right_r11 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r11", CubeListBuilder.create().texOffs(72, 251).addBox(-0.0279F, -3.1787F, -0.3384F, 0.6768F, 3.1641F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7616F, 10.6775F, 4.5894F, 1.1145F, -1.0932F, -0.7434F));
		PartDefinition Chang_qun_right_r12 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r12", CubeListBuilder.create().texOffs(44, 203).addBox(-2.9552F, -3.2674F, -0.3384F, 2.717F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7122F, 10.7068F, 4.8651F, 0.8049F, -1.2743F, -0.4108F));
		PartDefinition Chang_qun_right_r13 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r13", CubeListBuilder.create().texOffs(90, 212).addBox(-1.1811F, -3.1787F, -0.3384F, 2.5396F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6686F, 10.9429F, 1.0973F, 0.393F, -1.3498F, 0.0146F));
		PartDefinition Chang_qun_right_r14 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r14", CubeListBuilder.create().texOffs(40, 246).addBox(-0.028F, -3.1787F, -0.6045F, 0.9429F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.024F, 10.8824F, -0.5929F, -3.0438F, -1.5565F, -2.8228F));
		PartDefinition Chang_qun_right_r15 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r15", CubeListBuilder.create().texOffs(98, 212).addBox(-1.1811F, -3.1787F, -0.3384F, 2.5396F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5799F, 10.9429F, -1.4112F, -0.393F, 1.3498F, 0.0146F));
		PartDefinition Chang_qun_right_r16 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r16", CubeListBuilder.create().texOffs(78, 229).addBox(-2.7334F, -3.2674F, -0.3384F, 1.83F, 3.2528F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6235F, 10.7068F, -5.179F, -0.8049F, 1.2743F, -0.4108F));
		PartDefinition Chang_qun_right_r17 = Chang_qun_right.addOrReplaceChild("Chang_qun_right_r17", CubeListBuilder.create().texOffs(34, 241).addBox(-0.6489F, -3.1787F, -0.3384F, 1.2977F, 3.1641F, 0.6768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6729F, 10.6775F, -4.9033F, -1.1145F, 1.0932F, -0.7434F));
		PartDefinition bone100 = Chang_qun_right.addOrReplaceChild("bone100", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9217F, 11.7714F, 2.8874F, 0.4214F, -1.3977F, -0.1014F));
		PartDefinition bone100_r1 = bone100.addOrReplaceChild("bone100_r1", CubeListBuilder.create().texOffs(36, 268).addBox(0.4435F, -1.0645F, -2.7942F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2892F, 0.0753F, -0.9122F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone100_r2 = bone100.addOrReplaceChild("bone100_r2", CubeListBuilder.create().texOffs(36, 268).addBox(0.4435F, -1.0645F, -0.133F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2247F, 0.0753F, -0.9122F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone100_r3 = bone100.addOrReplaceChild("bone100_r3", CubeListBuilder.create().texOffs(2, 263).addBox(-4.2578F, -1.0645F, -0.0887F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)).texOffs(4, 263).addBox(-3.1046F, -1.0645F,
				0.1774F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4163F, -0.0395F, -0.4838F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone100_r4 = bone100.addOrReplaceChild("bone100_r4", CubeListBuilder.create().texOffs(6, 263).addBox(-0.4435F, -1.0645F, 0.1774F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6482F, 0.0064F, -0.6552F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone91 = Chang_qun_right.addOrReplaceChild("bone91", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9217F, 11.7945F, -3.3771F, -0.4214F, 1.3977F, -0.1014F));
		PartDefinition bone91_r1 = bone91.addOrReplaceChild("bone91_r1", CubeListBuilder.create().texOffs(36, 268).addBox(0.4435F, -1.0645F, 2.5281F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2892F, 0.0753F, 0.9122F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone91_r2 = bone91.addOrReplaceChild("bone91_r2", CubeListBuilder.create().texOffs(36, 268).addBox(0.4435F, -1.0645F, -0.133F, 0.4435F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2247F, 0.0753F, 0.9122F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone91_r3 = bone91.addOrReplaceChild("bone91_r3", CubeListBuilder.create().texOffs(84, 259).addBox(-3.1046F, -1.0645F, -0.4435F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4163F, -0.0395F, 0.4838F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone91_r4 = bone91.addOrReplaceChild("bone91_r4", CubeListBuilder.create().texOffs(0, 263).addBox(-0.4435F, -1.0645F, -0.4435F, 1.3306F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6482F, 0.0064F, 0.6552F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone90 = Chang_qun_right.addOrReplaceChild("bone90", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2564F, 10.7186F, -7.0976F, -0.7484F, 0.9823F, -0.4945F));
		PartDefinition bone90_r1 = bone90.addOrReplaceChild("bone90_r1", CubeListBuilder.create().texOffs(0, 270).addBox(0.4435F, -0.887F, 2.5281F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.862F, -0.0138F, 1.9353F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone90_r2 = bone90.addOrReplaceChild("bone90_r2", CubeListBuilder.create().texOffs(0, 270).addBox(0.4435F, -0.887F, -0.133F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7976F, -0.0138F, 1.9353F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition bone90_r3 = bone90.addOrReplaceChild("bone90_r3", CubeListBuilder.create().texOffs(20, 261).addBox(-3.4595F, -1.0645F, -0.4435F, 1.6854F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1566F, -0.1286F, 1.5069F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone90_r4 = bone90.addOrReplaceChild("bone90_r4", CubeListBuilder.create().texOffs(42, 264).addBox(-0.4435F, -0.887F, -0.4435F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.221F, -0.0827F, 1.6782F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone98 = Chang_qun_right.addOrReplaceChild("bone98", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2564F, 10.6955F, 6.6078F, 0.7484F, -0.9823F, -0.4945F));
		PartDefinition bone98_r1 = bone98.addOrReplaceChild("bone98_r1", CubeListBuilder.create().texOffs(0, 270).addBox(0.4435F, -0.887F, -2.7942F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.862F, -0.0138F, -1.9353F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone98_r2 = bone98.addOrReplaceChild("bone98_r2", CubeListBuilder.create().texOffs(36, 269).addBox(0.4435F, -0.887F, -0.1331F, 0.4435F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7976F, -0.0138F, -1.9353F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition bone98_r3 = bone98.addOrReplaceChild("bone98_r3", CubeListBuilder.create().texOffs(20, 259).addBox(-3.4595F, -1.0645F, 0.1774F, 1.6854F, 1.508F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1566F, -0.1286F, -1.5069F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone98_r4 = bone98.addOrReplaceChild("bone98_r4", CubeListBuilder.create().texOffs(42, 263).addBox(-0.4435F, -0.887F, 0.1774F, 1.3306F, 1.3306F, 0.2661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.221F, -0.0827F, -1.6782F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 36).addBox(-2.2767F, 0.0F, -1.984F, 4.3909F, 9.7574F, 3.968F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.3514F, 3.6051F, -0.3252F));
		PartDefinition RightLowerLeg = RightLeg.addOrReplaceChild("RightLowerLeg",
				CubeListBuilder.create().texOffs(24, 36).addBox(-2.1141F, 0.0F, -1.6588F, 4.2282F, 10.6374F, 3.968F, new CubeDeformation(0.0F)).texOffs(0, 61).addBox(-2.5541F, 3.96F, -2.0988F, 4.8442F, 2.3654F, 4.848F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.7574F, -0.3252F));
		PartDefinition RightLowerLeg_r1 = RightLowerLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(15, 84).addBox(-2.2619F, -1.1827F, -1.984F, 4.2282F, 2.8829F, 2.7114F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1478F, -0.5666F, 0.5805F, 0.7854F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-2.1141F, 0.0F, -1.984F, 4.3909F, 9.7574F, 3.968F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.3514F, 3.6051F, -0.3252F));
		PartDefinition LeftLowerLeg = LeftLeg.addOrReplaceChild("LeftLowerLeg", CubeListBuilder.create().texOffs(24, 36).mirror().addBox(-2.1141F, 0.0F, -1.6588F, 4.2282F, 10.6374F, 3.968F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 61)
				.mirror().addBox(-2.2901F, 3.96F, -2.0988F, 4.8442F, 2.3654F, 4.848F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 9.7574F, -0.3252F));
		PartDefinition RightLowerLeg_r2 = LeftLowerLeg.addOrReplaceChild("RightLowerLeg_r2", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-1.9663F, -1.1827F, -1.984F, 4.2282F, 2.8829F, 2.7114F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1478F, -0.5666F, 0.5805F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		AllHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
