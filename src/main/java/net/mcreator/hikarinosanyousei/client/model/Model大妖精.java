package net.mcreator.hikarinosanyousei.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Model大妖精<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hikari_no_sanyousei", "model_da_yao_jing"), "main");
	public final ModelPart AllHead;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Root;

	public Model大妖精(ModelPart root) {
		this.AllHead = root.getChild("AllHead");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Root = root.getChild("Root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition AllHead = partdefinition.addOrReplaceChild("AllHead", CubeListBuilder.create(), PartPose.offset(0.0F, -6.37F, 0.0F));
		PartDefinition Head = AllHead.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.7905F, -7.8907F, -4.2959F, 7.581F, 2.0108F, 9.1864F, new CubeDeformation(0.0F)).texOffs(38, 56).addBox(-3.7905F, -7.2799F, -4.2959F, 7.581F, 3.8297F, 1.5162F, new CubeDeformation(0.0F))
						.texOffs(4, 125).addBox(-1.2364F, -3.5134F, -4.2959F, 2.4729F, 2.3402F, 1.5162F, new CubeDeformation(0.0F)).texOffs(16, 67).addBox(-3.7905F, -1.1884F, -4.2959F, 7.581F, 1.3841F, 1.5162F, new CubeDeformation(0.0F))
						.texOffs(24, 14).addBox(-3.7905F, -0.6256F, -2.7923F, 7.581F, 0.8213F, 6.5828F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(-3.7905F, -6.8799F, -3.6822F, 7.581F, 6.3175F, 7.4727F, new CubeDeformation(0.0F))
						.texOffs(70, 14).addBox(3.7905F, -6.9407F, -4.2959F, 0.2527F, 7.1364F, 8.0864F, new CubeDeformation(0.0F)).texOffs(54, 14).addBox(-4.0432F, -6.9407F, -4.2959F, 0.2527F, 7.1364F, 8.0864F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.306F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(10, 85).addBox(-1.2905F, -0.5554F, -1.0682F, 3.581F, 4.1108F, 2.136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8806F, -4.275F, 3.9723F, 0.0F, 0.0F, 1.7453F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(28, 41).addBox(-1.2905F, -0.5554F, -4.0682F, 2.581F, 1.1108F, 6.8364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3288F, -4.0821F, 0.4723F, 0.0F, 0.0F, 1.3963F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(96, 0).addBox(-2.5405F, -0.7054F, -3.8432F, 3.331F, 5.1108F, 9.1364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7657F, -6.0304F, -0.2527F, 0.0F, 0.0F, 1.309F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(93, 41).addBox(-1.2905F, -0.5554F, -4.0682F, 2.581F, 1.1108F, 6.8364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3288F, -4.0821F, 0.4723F, 0.0F, 0.0F, -1.3963F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(32, 77).addBox(-2.2905F, -0.5554F, -1.0682F, 3.581F, 5.1108F, 2.1364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8806F, -4.275F, 3.9723F, 0.0F, 0.0F, -1.7453F));
		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 14).addBox(-0.7905F, -0.7054F, -3.8432F, 3.331F, 4.1108F, 9.136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7657F, -6.0304F, -0.2527F, 0.0F, 0.0F, -1.309F));
		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.736F, -3.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -7.736F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone32 = bone.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(58, 146).addBox(-0.7866F, -2.6014F, -0.2106F, 1.5472F, 2.7048F, 1.2849F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6618F, 1.0583F, 0.2142F, 2.2372F, -1.4786F, -2.5851F));
		PartDefinition bone32_r1 = bone32.addOrReplaceChild("bone32_r1", CubeListBuilder.create().texOffs(22, 196).addBox(-0.2936F, -0.3767F, -0.4505F, 0.5872F, 1.0605F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.745F, -0.6538F, -0.195F, -0.2467F, 0.0886F, -0.8837F));
		PartDefinition bone32_r2 = bone32.addOrReplaceChild("bone32_r2", CubeListBuilder.create().texOffs(46, 166).addBox(-0.4088F, -1.2023F, -0.4505F, 1.1248F, 2.7117F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8011F, 2.7858F, -0.1571F, -0.2382F, 0.1096F, -0.7985F));
		PartDefinition bone32_r3 = bone32.addOrReplaceChild("bone32_r3", CubeListBuilder.create().texOffs(12, 179).addBox(-1.1384F, -1.2023F, -0.4505F, 0.7408F, 2.5581F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1168F, 1.5817F, -0.378F, -0.2427F, 0.0992F, -0.8411F));
		PartDefinition bone32_r4 = bone32.addOrReplaceChild("bone32_r4", CubeListBuilder.create().texOffs(26, 175).addBox(-0.8696F, -1.5863F, -0.4505F, 1.048F, 2.4045F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.462F, 0.672F, 0.122F, -0.228F, 0.1298F, -0.713F));
		PartDefinition bone32_r5 = bone32.addOrReplaceChild("bone32_r5", CubeListBuilder.create().texOffs(33, 209).addBox(-0.8696F, -1.2023F, -0.4505F, 0.8176F, 2.4045F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0511F, 0.7979F, 0.2139F, -0.1791F, 0.192F, -0.41F));
		PartDefinition bone32_r6 = bone32.addOrReplaceChild("bone32_r6", CubeListBuilder.create().texOffs(16, 179).addBox(0.052F, -1.2023F, -0.4505F, 0.8176F, 2.4045F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9387F, 0.7979F, 0.2139F, -0.1791F, -0.192F, 0.41F));
		PartDefinition bone32_r7 = bone32.addOrReplaceChild("bone32_r7", CubeListBuilder.create().texOffs(22, 175).addBox(-0.1784F, -1.5863F, -0.4505F, 1.048F, 2.4045F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3497F, 0.672F, 0.122F, -0.228F, -0.1298F, 0.713F));
		PartDefinition bone32_r8 = bone32.addOrReplaceChild("bone32_r8", CubeListBuilder.create().texOffs(42, 166).addBox(-0.716F, -1.2023F, -0.4505F, 1.1248F, 2.7117F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6887F, 2.7858F, -0.1571F, -0.2382F, -0.1096F, 0.7985F));
		PartDefinition bone32_r9 = bone32.addOrReplaceChild("bone32_r9", CubeListBuilder.create().texOffs(20, 179).addBox(0.3976F, -1.2023F, -0.4505F, 0.7408F, 2.5581F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0045F, 1.5817F, -0.378F, -0.2427F, -0.0992F, 0.8411F));
		PartDefinition bone32_r10 = bone32.addOrReplaceChild("bone32_r10", CubeListBuilder.create().texOffs(50, 146).addBox(-1.3524F, -1.0609F, -0.4174F, 1.7392F, 3.4797F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.098F, -0.8864F, 0.2068F, -0.2618F, 0.0F, -1.2217F));
		PartDefinition bone32_r11 = bone32.addOrReplaceChild("bone32_r11", CubeListBuilder.create().texOffs(58, 175).addBox(-0.5816F, -1.2634F, -0.5568F, 1.1632F, 1.1443F, 1.1136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0668F, -2.426F, -0.3275F, -0.162F, -0.1468F, -2.3879F));
		PartDefinition bone32_r12 = bone32.addOrReplaceChild("bone32_r12", CubeListBuilder.create().texOffs(18, 160).addBox(-0.3896F, -1.6439F, -0.6108F, 1.1632F, 3.2947F, 1.1136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.098F, -0.8864F, 0.2068F, -0.2182F, 0.0F, -1.6581F));
		PartDefinition bone32_r13 = bone32.addOrReplaceChild("bone32_r13", CubeListBuilder.create().texOffs(24, 133).addBox(-0.3397F, -2.0012F, -0.8014F, 1.9382F, 3.6717F, 1.0915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8114F, -1.6903F, 0.2068F, -0.2182F, 0.0F, -1.9635F));
		PartDefinition bone32_r14 = bone32.addOrReplaceChild("bone32_r14", CubeListBuilder.create().texOffs(26, 196).addBox(-0.2936F, -0.3767F, -0.4505F, 0.5872F, 1.0605F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8323F, -0.6538F, -0.195F, -0.2467F, -0.0886F, 0.8837F));
		PartDefinition bone32_r15 = bone32.addOrReplaceChild("bone32_r15", CubeListBuilder.create().texOffs(44, 146).addBox(-0.3868F, -1.0609F, -0.4174F, 1.7392F, 3.4797F, 0.9009F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1853F, -0.8864F, 0.2068F, -0.2618F, 0.0F, 1.2217F));
		PartDefinition bone32_r16 = bone32.addOrReplaceChild("bone32_r16", CubeListBuilder.create().texOffs(62, 168).addBox(-0.5816F, -1.2634F, -0.5568F, 1.1632F, 1.1443F, 1.1136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1541F, -2.426F, -0.3275F, -0.162F, 0.1468F, 2.3879F));
		PartDefinition bone32_r17 = bone32.addOrReplaceChild("bone32_r17", CubeListBuilder.create().texOffs(14, 160).addBox(-0.7736F, -1.6439F, -0.6108F, 1.1632F, 3.2947F, 1.1136F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1853F, -0.8864F, 0.2068F, -0.2182F, 0.0F, 1.6581F));
		PartDefinition bone32_r18 = bone32.addOrReplaceChild("bone32_r18", CubeListBuilder.create().texOffs(32, 130).addBox(-1.5985F, -2.0012F, -0.8014F, 1.9382F, 3.6717F, 1.0915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8987F, -1.6903F, 0.2068F, -0.2182F, 0.0F, 1.9635F));
		PartDefinition bone24 = bone.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, 0.0F));
		PartDefinition cube_r1 = bone24.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 121).addBox(-0.7F, -0.625F, -1.0F, 2.4F, 0.95F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7774F, 7.6451F, 0.0F, 0.0F, 0.0F, 1.2654F));
		PartDefinition cube_r2 = bone24.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 139).addBox(-1.05F, -0.375F, -1.0F, 1.7F, 0.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9288F, 8.7602F, 0.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition cube_r3 = bone24.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 130).addBox(-0.7F, -0.125F, -1.1F, 2.1F, 0.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.66F, 6.802F, 0.1F, 0.0F, 0.0F, 0.7418F));
		PartDefinition cube_r4 = bone24.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 142).addBox(-0.7F, -1.0F, -1.1F, 1.4F, 1.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9423F, 6.7898F, 0.1F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r5 = bone24.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 159).addBox(-0.75F, -0.15F, -1.0F, 1.6F, 0.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3131F, 7.8009F, 0.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r6 = bone24.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 154).addBox(-0.85F, -0.05F, -1.0F, 1.6F, 0.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2681F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0036F));
		PartDefinition cube_r7 = bone24.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 155).addBox(-0.75F, -0.15F, -1.0F, 1.5F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4403F, 6.6248F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r8 = bone24.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 155).addBox(1.375F, -0.25F, -1.0F, 1.5F, 0.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3765F, 4.7673F, 0.0F, 0.0F, 0.0F, 1.0036F));
		PartDefinition cube_r9 = bone24.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 135).addBox(-0.875F, -0.25F, -1.0F, 2.0F, 0.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4114F, 5.0916F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r10 = bone24.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 139).addBox(-2.0F, -1.0F, -1.0F, 1.75F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2392F, 4.9529F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r11 = bone24.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 53).addBox(-3.5F, -1.0F, -0.9F, 7.5F, 2.0F, 1.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9375F, 2.7421F, 0.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r12 = bone24.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 103).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7557F, 2.2798F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r13 = bone24.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 97).addBox(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0217F, -2.8065F, 0.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition cube_r14 = bone24.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 125).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2871F, -1.4722F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r15 = bone24.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(4, 121).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1957F, 0.0F));
		PartDefinition Eyes = Face.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(-0.2527F, 21.1214F, 0.0F));
		PartDefinition Eyelid = Eyes.addOrReplaceChild("Eyelid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftEyelid = Eyelid.addOrReplaceChild("LeftEyelid", CubeListBuilder.create().texOffs(40, 121).addBox(-1.3899F, -1.4371F, -0.5054F, 2.7797F, 2.8118F, 1.0108F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6534F, -23.8801F, -3.2851F));
		PartDefinition LeftEyelidBase = LeftEyelid.addOrReplaceChild("LeftEyelidBase", CubeListBuilder.create().texOffs(60, 160).addBox(-0.5325F, -0.9372F, -0.5054F, 1.5162F, 2.3118F, 1.0108F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.6318F, 0.0F, -0.2527F));
		PartDefinition RightEyelid = Eyelid.addOrReplaceChild("RightEyelid", CubeListBuilder.create().texOffs(22, 125).addBox(-1.3899F, -1.5371F, -0.5054F, 2.7797F, 2.9118F, 1.0108F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.148F, -23.8801F, -3.2851F));
		PartDefinition RightEyelidBase = RightEyelid.addOrReplaceChild("RightEyelidBase", CubeListBuilder.create().texOffs(60, 163).addBox(3.0053F, -0.9371F, -0.5054F, 1.5162F, 2.3118F, 1.0108F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.3683F, 0.0F, -0.2527F));
		PartDefinition LeftEyebrow = Eyes.addOrReplaceChild("LeftEyebrow", CubeListBuilder.create().texOffs(40, 156).addBox(-2.0667F, -2.7165F, -0.1263F, 2.7797F, 2.8243F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(3.3302F, -25.1805F, -4.1064F));
		PartDefinition zuo_mei_mao = LeftEyebrow.addOrReplaceChild("zuo_mei_mao", CubeListBuilder.create().texOffs(24, 201).addBox(-0.7581F, -0.3791F, -0.1264F, 1.5162F, 0.5054F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0451F, 0.2868F, -0.3159F));
		PartDefinition zuo_mei_mao_small = zuo_mei_mao.addOrReplaceChild("zuo_mei_mao_small", CubeListBuilder.create().texOffs(24, 200).addBox(-1.5162F, -0.2527F, -0.1264F, 1.5162F, 0.5054F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7581F, -0.1264F, 0.0F));
		PartDefinition zuo_xia_yan_pi = Eyes.addOrReplaceChild("zuo_xia_yan_pi", CubeListBuilder.create().texOffs(56, 167).addBox(-1.3899F, -0.7317F, -0.1263F, 2.7797F, 1.2635F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6534F, -21.6737F, -4.1064F));
		PartDefinition RightEyebrow = Eyes.addOrReplaceChild("RightEyebrow", CubeListBuilder.create().texOffs(40, 153).addBox(-0.9386F, -2.7165F, -0.1263F, 2.7797F, 2.8243F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5992F, -25.1805F, -4.1064F));
		PartDefinition you_mei_mao = RightEyebrow.addOrReplaceChild("you_mei_mao", CubeListBuilder.create().texOffs(24, 199).addBox(-0.7581F, -0.3791F, -0.1264F, 1.5162F, 0.5054F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.1805F, 0.2868F, -0.3159F));
		PartDefinition you_mei_mao_small = you_mei_mao.addOrReplaceChild("you_mei_mao_small", CubeListBuilder.create().texOffs(20, 201).addBox(0.0F, -0.3791F, -0.1264F, 1.5162F, 0.5054F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(0.7581F, 0.0F, 0.0F));
		PartDefinition you_xia_yan_pi = Eyes.addOrReplaceChild("you_xia_yan_pi", CubeListBuilder.create().texOffs(56, 166).addBox(-1.3899F, 0.2683F, -0.1263F, 2.7797F, 1.2635F, 0.2527F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.148F, -22.6738F, -4.1064F));
		PartDefinition zuo_mei_mao2 = Eyes.addOrReplaceChild("zuo_mei_mao2", CubeListBuilder.create().texOffs(34, 172).addBox(-1.3899F, -0.1264F, -0.2527F, 2.7797F, 0.2527F, 0.5054F, new CubeDeformation(0.0F)),
				PartPose.offset(2.686F, -25.9023F, -4.1696F));
		PartDefinition you_mei_mao2 = Eyes.addOrReplaceChild("you_mei_mao2", CubeListBuilder.create().texOffs(34, 171).addBox(-1.3899F, -0.1264F, -0.2527F, 2.7797F, 0.2527F, 0.5054F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.1806F, -25.9023F, -4.1696F));
		PartDefinition hair2 = Head.addOrReplaceChild("hair2", CubeListBuilder.create().texOffs(0, 35).addBox(-3.402F, 70.6645F, -1.7777F, 6.804F, 0.729F, 4.86F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -78.486F, 0.0F));
		PartDefinition hair2_r1 = hair2.addOrReplaceChild("hair2_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-3.402F, -1.0075F, -1.84F, 6.804F, 1.215F, 8.93F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 70.6267F, -2.2456F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone78 = hair2.addOrReplaceChild("bone78", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.43F, 72.5135F, -4.4955F, -0.0873F, 0.0F, 0.2182F));
		PartDefinition bone78_r1 = bone78.addOrReplaceChild("bone78_r1", CubeListBuilder.create().texOffs(36, 204).addBox(-0.972F, -3.0585F, -0.1822F, 0.972F, 3.888F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone78_r2 = bone78.addOrReplaceChild("bone78_r2", CubeListBuilder.create().texOffs(39, 202).addBox(-0.243F, -0.536F, -0.2126F, 0.486F, 1.472F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5776F, 1.1885F, 0.0304F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone78_r3 = bone78.addOrReplaceChild("bone78_r3", CubeListBuilder.create().texOffs(48, 202).addBox(-0.243F, -0.829F, -0.2126F, 0.486F, 1.272F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2147F, 1.5761F, 0.0304F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone9 = hair2.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.68F, 70.5135F, -4.4955F, -0.0869F, 0.0076F, 0.3051F));
		PartDefinition bone12_r1 = bone9.addOrReplaceChild("bone12_r1", CubeListBuilder.create().texOffs(6, 202).addBox(0.114F, -1.169F, -0.2126F, 0.172F, 0.788F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4564F, 3.4637F, 0.2006F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone11_r1 = bone9.addOrReplaceChild("bone11_r1", CubeListBuilder.create().texOffs(54, 203).addBox(-0.186F, -1.169F, -0.2126F, 0.272F, 1.588F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7067F, 3.4347F, 0.2006F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone10_r1 = bone9.addOrReplaceChild("bone10_r1", CubeListBuilder.create().texOffs(4, 199).addBox(-0.436F, -1.019F, -0.2126F, 0.372F, 2.338F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6399F, 0.9638F, 0.2006F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1", CubeListBuilder.create().texOffs(40, 179).addBox(-1.072F, -2.8085F, -0.1823F, 0.872F, 3.638F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, 1.9452F, 0.1702F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone9_r2 = bone9.addOrReplaceChild("bone9_r2", CubeListBuilder.create().texOffs(42, 201).addBox(-0.543F, -0.829F, -0.2126F, 0.586F, 1.172F, 0.4253F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2182F, 3.5213F, 0.2005F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone81 = hair2.addOrReplaceChild("bone81", CubeListBuilder.create(), PartPose.offsetAndRotation(3.64F, 73.0278F, -3.7605F, -0.2618F, -0.6109F, 0.0F));
		PartDefinition bone81_r1 = bone81.addOrReplaceChild("bone81_r1", CubeListBuilder.create().texOffs(0, 194).addBox(-0.8505F, -0.6575F, -0.393F, 0.951F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4028F, 3.491F, 0.0304F, 0.2835F, -0.1153F, 0.2017F));
		PartDefinition bone81_r2 = bone81.addOrReplaceChild("bone81_r2", CubeListBuilder.create().texOffs(56, 186).addBox(-0.8505F, -0.6575F, -0.393F, 1.201F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5336F, 2.4248F, -0.2935F, 0.3011F, -0.0522F, -0.0079F));
		PartDefinition bone81_r3 = bone81.addOrReplaceChild("bone81_r3", CubeListBuilder.create().texOffs(58, 196).addBox(-0.2755F, -1.2825F, -0.393F, 0.551F, 1.365F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2291F, 3.7577F, 0.1037F, 0.2F, -0.2324F, 0.6747F));
		PartDefinition bone81_r4 = bone81.addOrReplaceChild("bone81_r4", CubeListBuilder.create().texOffs(68, 196).addBox(-0.2755F, -1.0325F, -0.393F, 0.551F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8984F, 3.3414F, 0.0659F, 0.2956F, 0.0779F, -0.4247F));
		PartDefinition bone81_r5 = bone81.addOrReplaceChild("bone81_r5", CubeListBuilder.create().texOffs(24, 192).addBox(-0.2755F, -1.2825F, -0.393F, 0.551F, 2.065F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.397F, 1.7876F, -0.444F, 0.3052F, -0.0131F, -0.1329F));
		PartDefinition bone81_r6 = bone81.addOrReplaceChild("bone81_r6", CubeListBuilder.create().texOffs(72, 184).addBox(-0.2755F, -0.6575F, -0.393F, 0.551F, 2.565F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1766F, 1.1433F, -0.6562F, 0.2956F, -0.0779F, 0.0757F));
		PartDefinition bone81_r7 = bone81.addOrReplaceChild("bone81_r7", CubeListBuilder.create().texOffs(6, 179).addBox(-0.6075F, -0.7075F, -0.543F, 1.551F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2028F, 1.365F, -0.4834F, 0.3054F, 0.0F, -0.1745F));
		PartDefinition bone81_r8 = bone81.addOrReplaceChild("bone81_r8", CubeListBuilder.create().texOffs(18, 103).addBox(0.486F, -1.8435F, -0.543F, 1.944F, 4.152F, 1.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3629F, -1.2172F, -0.6548F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone6 = hair2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.64F, 73.0278F, -3.7605F, -0.2618F, 0.6109F, 0.0F));
		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(0, 192).addBox(-0.1005F, -0.6575F, -0.393F, 0.951F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4028F, 3.491F, 0.0304F, 0.2835F, 0.1153F, -0.2017F));
		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2", CubeListBuilder.create().texOffs(56, 184).addBox(-0.3505F, -0.6575F, -0.393F, 1.201F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5336F, 2.4248F, -0.2935F, 0.3011F, 0.0522F, 0.0079F));
		PartDefinition bone6_r3 = bone6.addOrReplaceChild("bone6_r3", CubeListBuilder.create().texOffs(54, 196).addBox(-0.2755F, -1.2825F, -0.393F, 0.551F, 1.365F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2291F, 3.7577F, 0.1037F, 0.2F, 0.2324F, -0.6747F));
		PartDefinition bone7_r1 = bone6.addOrReplaceChild("bone7_r1", CubeListBuilder.create().texOffs(44, 192).addBox(-0.2755F, -1.0325F, -0.393F, 0.551F, 2.015F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1718F, 0.1366F, -0.8659F, -0.0435F, -0.0013F, 0.5833F));
		PartDefinition bone8_r1 = bone6.addOrReplaceChild("bone8_r1", CubeListBuilder.create().texOffs(62, 196).addBox(-0.1255F, -1.0075F, -0.393F, 0.351F, 1.715F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.941F, 0.0857F, -0.8583F, -0.0431F, 0.0063F, 0.7577F));
		PartDefinition bone7_r2 = bone6.addOrReplaceChild("bone7_r2", CubeListBuilder.create().texOffs(52, 184).addBox(-0.2755F, -1.2825F, -0.393F, 0.851F, 2.065F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4243F, -1.4002F, -0.7924F, -0.0411F, -0.0143F, 0.2782F));
		PartDefinition bone8_r2 = bone6.addOrReplaceChild("bone8_r2", CubeListBuilder.create().texOffs(10, 196).addBox(-0.4255F, 0.0675F, -0.393F, 0.851F, 0.965F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.473F, -3.4129F, -0.6968F, -0.0432F, -0.0051F, 0.4961F));
		PartDefinition bone6_r4 = bone6.addOrReplaceChild("bone6_r4", CubeListBuilder.create().texOffs(64, 196).addBox(-0.2755F, -1.0325F, -0.393F, 0.551F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8984F, 3.3414F, 0.0659F, 0.2956F, -0.0779F, 0.4247F));
		PartDefinition bone6_r5 = bone6.addOrReplaceChild("bone6_r5", CubeListBuilder.create().texOffs(20, 192).addBox(-0.2755F, -1.2825F, -0.393F, 0.551F, 2.065F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.397F, 1.7876F, -0.444F, 0.3052F, 0.0131F, 0.1329F));
		PartDefinition bone6_r6 = bone6.addOrReplaceChild("bone6_r6", CubeListBuilder.create().texOffs(68, 184).addBox(-0.2755F, -0.6575F, -0.393F, 0.551F, 2.565F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1766F, 1.1433F, -0.6562F, 0.2956F, 0.0779F, -0.0757F));
		PartDefinition bone6_r7 = bone6.addOrReplaceChild("bone6_r7", CubeListBuilder.create().texOffs(0, 182).addBox(-0.9435F, -0.7075F, -0.543F, 1.551F, 1.315F, 0.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2028F, 1.365F, -0.4834F, 0.3054F, 0.0F, 0.1745F));
		PartDefinition bone6_r8 = bone6.addOrReplaceChild("bone6_r8", CubeListBuilder.create().texOffs(10, 103).addBox(-2.43F, -1.8435F, -0.543F, 1.944F, 4.152F, 1.786F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3629F, -1.2172F, -0.6548F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone82 = hair2.addOrReplaceChild("bone82", CubeListBuilder.create().texOffs(28, 199).addBox(-1.3647F, 3.3876F, -0.1687F, 0.529F, 1.479F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, 70.2275F, -4.374F, -0.0852F, -0.0189F, -0.2174F));
		PartDefinition bone83_r1 = bone82.addOrReplaceChild("bone83_r1", CubeListBuilder.create().texOffs(0, 202).addBox(-0.2645F, -0.7395F, -0.293F, 0.429F, 0.729F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9758F, 5.5489F, 0.1243F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone83_r2 = bone82.addOrReplaceChild("bone83_r2", CubeListBuilder.create().texOffs(48, 199).addBox(-0.079F, -0.6145F, -0.293F, 0.358F, 1.079F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8932F, 5.0379F, 0.1243F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone82_r1 = bone82.addOrReplaceChild("bone82_r1", CubeListBuilder.create().texOffs(20, 199).addBox(-0.379F, -0.6645F, -0.293F, 0.658F, 1.229F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6818F, 3.9469F, 0.1243F, 0.0F, 0.0F, 0.3054F));
		PartDefinition bone83_r3 = bone82.addOrReplaceChild("bone83_r3", CubeListBuilder.create().texOffs(4, 202).addBox(-0.079F, -0.3145F, -0.293F, 0.258F, 0.629F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0117F, 4.1731F, 0.1243F, 0.0F, 0.0F, -0.5672F));
		PartDefinition bone82_r2 = bone82.addOrReplaceChild("bone82_r2", CubeListBuilder.create().texOffs(2, 202).addBox(-0.079F, -0.8145F, -0.343F, 0.358F, 0.629F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1066F, 4.1143F, 0.1743F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone82_r3 = bone82.addOrReplaceChild("bone82_r3", CubeListBuilder.create().texOffs(50, 199).addBox(-0.079F, -1.0645F, -0.343F, 0.258F, 1.129F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1566F, 4.3499F, 0.1743F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone82_r4 = bone82.addOrReplaceChild("bone82_r4", CubeListBuilder.create().texOffs(58, 198).addBox(-0.579F, -0.3645F, -0.293F, 1.358F, 0.329F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7847F, 3.4978F, 0.1243F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone82_r5 = bone82.addOrReplaceChild("bone82_r5", CubeListBuilder.create().texOffs(22, 205).addBox(-1.215F, -2.5725F, -0.343F, 1.644F, 3.909F, 0.586F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9924F, 0.1743F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone83 = hair2.addOrReplaceChild("bone83", CubeListBuilder.create(), PartPose.offsetAndRotation(1.813F, 70.0275F, -4.374F, -0.1249F, -0.0393F, -0.0412F));
		PartDefinition bone83_r4 = bone83.addOrReplaceChild("bone83_r4", CubeListBuilder.create().texOffs(32, 201).addBox(-0.3645F, -0.5645F, -0.243F, 0.629F, 1.329F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3582F, 3.8322F, 0.2859F, 0.0F, 0.0F, -0.9163F));
		PartDefinition bone83_r5 = bone83.addOrReplaceChild("bone83_r5", CubeListBuilder.create().texOffs(34, 200).addBox(-0.2645F, -0.5645F, -0.243F, 0.629F, 1.129F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7971F, 3.8527F, 0.2859F, 0.0F, 0.0F, -0.48F));
		PartDefinition bone83_r6 = bone83.addOrReplaceChild("bone83_r6", CubeListBuilder.create().texOffs(72, 168).addBox(-0.3645F, -0.6075F, -0.243F, 1.229F, 0.729F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0005F, 3.5522F, 0.2859F, 0.0F, 0.0F, -0.3054F));
		PartDefinition bone83_r7 = bone83.addOrReplaceChild("bone83_r7", CubeListBuilder.create().texOffs(34, 166).addBox(-0.386F, -2.8155F, -0.243F, 1.358F, 3.652F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2573F, 2.2027F, 0.2859F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone10 = hair2.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.187F, 72.0275F, -4.374F, -0.1304F, 0.0114F, 0.3483F));
		PartDefinition bone10_r2 = bone10.addOrReplaceChild("bone10_r2", CubeListBuilder.create().texOffs(50, 199).addBox(-0.3645F, -0.5645F, -0.243F, 0.429F, 1.129F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8849F, 1.6092F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone10_r3 = bone10.addOrReplaceChild("bone10_r3", CubeListBuilder.create().texOffs(28, 201).addBox(-0.1645F, -0.6075F, -0.243F, 1.029F, 0.729F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3484F, 1.3024F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition bone10_r4 = bone10.addOrReplaceChild("bone10_r4", CubeListBuilder.create().texOffs(20, 175).addBox(-0.086F, -2.8155F, -0.243F, 1.058F, 3.652F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone84 = hair2.addOrReplaceChild("bone84", CubeListBuilder.create(), PartPose.offsetAndRotation(2.105F, 69.7845F, -4.374F, -0.1551F, -0.0803F, -0.1683F));
		PartDefinition bone84_r1 = bone84.addOrReplaceChild("bone84_r1", CubeListBuilder.create().texOffs(53, 201).addBox(-0.2395F, -0.3645F, -0.243F, 0.479F, 0.929F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5701F, 4.3341F, 0.3834F, 0.0F, 0.0F, -0.6545F));
		PartDefinition bone84_r2 = bone84.addOrReplaceChild(
				"bone84_r2", CubeListBuilder.create().texOffs(2, 202).addBox(0.736F, 2.0655F, -0.243F, 0.479F, 0.729F, 0.486F, new CubeDeformation(0.0F)).texOffs(32, 200)
						.addBox(0.243F, 1.3365F, -0.243F, 0.972F, 0.729F, 0.486F, new CubeDeformation(0.0F)).texOffs(68, 168).addBox(0.243F, -2.5725F, -0.243F, 0.972F, 3.909F, 0.486F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3523F, 2.1746F, 0.3834F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone85 = hair2.addOrReplaceChild("bone85", CubeListBuilder.create(), PartPose.offsetAndRotation(4.131F, 73.2425F, -1.944F, 2.3541F, -1.4489F, -2.6407F));
		PartDefinition bone85_r1 = bone85.addOrReplaceChild("bone85_r1", CubeListBuilder.create().texOffs(12, 175).addBox(-0.336F, -1.3005F, -0.6075F, 0.672F, 2.301F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.841F, 4.2308F, 0.7917F, 0.1434F, -0.0998F, 0.7346F));
		PartDefinition bone85_r2 = bone85.addOrReplaceChild("bone85_r2", CubeListBuilder.create().texOffs(50, 175).addBox(-0.486F, -1.1505F, -0.6075F, 0.672F, 2.001F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.078F, 4.3438F, 0.8169F, 0.1666F, -0.0522F, 0.432F));
		PartDefinition bone85_r3 = bone85.addOrReplaceChild("bone85_r3", CubeListBuilder.create().texOffs(8, 163).addBox(-0.6075F, -0.3645F, -0.243F, 1.701F, 1.701F, 1.2973F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3951F, 2.2191F, 0.0596F, 0.1745F, 0.0F, 0.1309F));
		PartDefinition bone85_r4 = bone85.addOrReplaceChild("bone85_r4", CubeListBuilder.create().texOffs(36, 139).addBox(-1.701F, -1.5795F, -0.243F, 1.458F, 3.645F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone18 = hair2.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.131F, 73.2425F, -1.944F, 2.3541F, 1.4489F, 2.6407F));
		PartDefinition bone18_r1 = bone18.addOrReplaceChild("bone18_r1", CubeListBuilder.create().texOffs(8, 175).addBox(-0.336F, -1.3005F, -0.6075F, 0.672F, 2.301F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.841F, 4.2308F, 0.7917F, 0.1434F, 0.0998F, -0.7346F));
		PartDefinition bone18_r2 = bone18.addOrReplaceChild("bone18_r2", CubeListBuilder.create().texOffs(46, 175).addBox(-0.186F, -1.1505F, -0.6075F, 0.672F, 2.001F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.078F, 4.3438F, 0.8169F, 0.1666F, 0.0522F, -0.432F));
		PartDefinition bone18_r3 = bone18.addOrReplaceChild("bone18_r3", CubeListBuilder.create().texOffs(8, 160).addBox(-1.0935F, -0.3645F, -0.243F, 1.701F, 1.701F, 1.2973F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3951F, 2.2191F, 0.0596F, 0.1745F, 0.0F, -0.1309F));
		PartDefinition bone18_r4 = bone18.addOrReplaceChild("bone18_r4", CubeListBuilder.create().texOffs(32, 139).addBox(0.243F, -1.5795F, -0.243F, 1.458F, 3.645F, 1.215F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone87 = hair2.addOrReplaceChild("bone87", CubeListBuilder.create(), PartPose.offsetAndRotation(3.631F, 73.2425F, -0.486F, 1.7761F, -1.3372F, -2.2315F));
		PartDefinition bone87_r1 = bone87.addOrReplaceChild("bone87_r1", CubeListBuilder.create().texOffs(16, 168).addBox(-0.486F, -0.6645F, -0.486F, 1.372F, 1.029F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7812F, 4.7948F, 0.7885F, 0.1551F, -0.0803F, 0.6046F));
		PartDefinition bone87_r2 = bone87.addOrReplaceChild("bone87_r2", CubeListBuilder.create().texOffs(16, 171).addBox(-0.4435F, -0.729F, -0.736F, 0.787F, 1.558F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6262F, 4.8847F, 1.0315F, 0.1069F, -0.1382F, 1.0398F));
		PartDefinition bone87_r3 = bone87.addOrReplaceChild("bone87_r3", CubeListBuilder.create().texOffs(16, 177).addBox(0.2815F, -0.729F, -0.736F, 0.687F, 1.458F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2008F, 3.684F, 0.8118F, 0.1551F, -0.0803F, 0.6046F));
		PartDefinition bone87_r4 = bone87.addOrReplaceChild("bone87_r4", CubeListBuilder.create().texOffs(36, 146).addBox(-1.0935F, -1.229F, -0.486F, 1.937F, 1.458F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8654F, 4.3843F, 0.6957F, 0.1705F, -0.0376F, 0.3459F));
		PartDefinition bone87_r5 = bone87.addOrReplaceChild("bone87_r5", CubeListBuilder.create().texOffs(32, 124).addBox(-1.0935F, -0.3645F, -0.243F, 2.673F, 1.701F, 1.458F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3951F, 2.2191F, 0.0596F, 0.1745F, 0.0F, 0.1309F));
		PartDefinition bone87_r6 = bone87.addOrReplaceChild("bone87_r6", CubeListBuilder.create().texOffs(60, 103).addBox(-1.944F, -0.5795F, -1.343F, 2.687F, 2.645F, 1.515F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2229F, -0.1688F, 0.4921F, 0.2618F, 0.0F, 0.1309F));
		PartDefinition bone13 = hair2.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.631F, 73.2425F, -0.486F, 1.7761F, 1.3372F, 2.2315F));
		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1", CubeListBuilder.create().texOffs(16, 166).addBox(-0.886F, -0.6645F, -0.486F, 1.372F, 1.029F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7812F, 4.7948F, 0.7885F, 0.1551F, 0.0803F, -0.6046F));
		PartDefinition bone13_r2 = bone13.addOrReplaceChild("bone13_r2", CubeListBuilder.create().texOffs(12, 171).addBox(-0.3435F, -0.729F, -0.736F, 0.787F, 1.558F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6262F, 4.8847F, 1.0315F, 0.1069F, 0.1382F, -1.0398F));
		PartDefinition bone13_r3 = bone13.addOrReplaceChild("bone13_r3", CubeListBuilder.create().texOffs(16, 175).addBox(-0.9685F, -0.729F, -0.736F, 0.687F, 1.458F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2008F, 3.684F, 0.8118F, 0.1551F, 0.0803F, -0.6046F));
		PartDefinition bone13_r4 = bone13.addOrReplaceChild("bone13_r4", CubeListBuilder.create().texOffs(30, 150).addBox(-0.8435F, -1.229F, -0.486F, 1.937F, 1.458F, 1.472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8654F, 4.3843F, 0.6957F, 0.1705F, 0.0376F, -0.3459F));
		PartDefinition bone13_r5 = bone13.addOrReplaceChild("bone13_r5", CubeListBuilder.create().texOffs(32, 121).addBox(-1.5795F, -0.3645F, -0.243F, 2.673F, 1.701F, 1.458F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3951F, 2.2191F, 0.0596F, 0.1745F, 0.0F, -0.1309F));
		PartDefinition bone13_r6 = bone13.addOrReplaceChild("bone13_r6", CubeListBuilder.create().texOffs(50, 103).addBox(-0.743F, -0.5795F, -1.343F, 2.687F, 2.645F, 1.515F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2229F, -0.1688F, 0.4921F, 0.2618F, 0.0F, -0.1309F));
		PartDefinition bone89 = hair2.addOrReplaceChild("bone89", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4942F, 73.8943F, 0.7465F, 0.0946F, -0.0059F, -0.4327F));
		PartDefinition bone89_r1 = bone89.addOrReplaceChild("bone89_r1", CubeListBuilder.create().texOffs(16, 199).addBox(-0.558F, -0.3645F, -0.3954F, 0.616F, 0.729F, 0.7908F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0669F, 5.3844F, 1.7576F, 0.0F, -0.2618F, 1.6581F));
		PartDefinition bone89_r2 = bone89.addOrReplaceChild("bone89_r2", CubeListBuilder.create().texOffs(58, 190).addBox(-0.5935F, -0.3645F, -0.3844F, 1.287F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0967F, 5.0439F, 0.8884F, 0.0F, -0.7418F, 1.6581F));
		PartDefinition bone89_r3 = bone89.addOrReplaceChild("bone89_r3", CubeListBuilder.create().texOffs(52, 194).addBox(-0.5935F, -0.3645F, -0.3844F, 1.187F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1722F, 4.1801F, 0.3623F, 0.0F, -0.3491F, 1.6581F));
		PartDefinition bone89_r4 = bone89.addOrReplaceChild("bone89_r4",
				CubeListBuilder.create().texOffs(20, 173).addBox(4.2525F, -0.3645F, -0.465F, 1.187F, 0.729F, 1.4688F, new CubeDeformation(0.0F)).texOffs(0, 80).addBox(-1.5795F, -0.3645F, -1.245F, 5.832F, 0.729F, 2.2487F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, 1.0431F, 0.0F, 0.0F, 1.6581F));
		PartDefinition bone17 = hair2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4942F, 73.8943F, 0.7465F, 0.0946F, 0.0059F, 0.4327F));
		PartDefinition bone17_r1 = bone17.addOrReplaceChild("bone17_r1", CubeListBuilder.create().texOffs(12, 199).addBox(-0.058F, -0.3645F, -0.3954F, 0.616F, 0.729F, 0.7908F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0669F, 5.3844F, 1.7576F, 0.0F, 0.2618F, -1.6581F));
		PartDefinition bone17_r2 = bone17.addOrReplaceChild("bone17_r2", CubeListBuilder.create().texOffs(58, 188).addBox(-0.6935F, -0.3645F, -0.3844F, 1.287F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0967F, 5.0439F, 0.8884F, 0.0F, 0.7418F, -1.6581F));
		PartDefinition bone17_r3 = bone17.addOrReplaceChild("bone17_r3", CubeListBuilder.create().texOffs(52, 192).addBox(-0.5935F, -0.3645F, -0.3844F, 1.187F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1722F, 4.1801F, 0.3623F, 0.0F, 0.3491F, -1.6581F));
		PartDefinition bone17_r4 = bone17.addOrReplaceChild("bone17_r4",
				CubeListBuilder.create().texOffs(20, 171).addBox(-5.4395F, -0.3645F, -0.465F, 1.187F, 0.729F, 1.4688F, new CubeDeformation(0.0F)).texOffs(50, 71).addBox(-4.2525F, -0.3645F, -1.245F, 5.832F, 0.729F, 2.2487F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.58F, -0.4808F, 1.0431F, 0.0F, 0.0F, -1.6581F));
		PartDefinition bone14 = hair2.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1942F, 73.8943F, 1.7535F, -0.0073F, 0.0059F, -0.4327F));
		PartDefinition bone14_r1 = bone14.addOrReplaceChild("bone14_r1", CubeListBuilder.create().texOffs(8, 199).addBox(-0.558F, -0.3645F, -0.3954F, 0.616F, 0.729F, 0.7907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0669F, 5.3844F, -1.7576F, 0.0F, 0.2618F, 1.6581F));
		PartDefinition bone14_r2 = bone14.addOrReplaceChild("bone14_r2", CubeListBuilder.create().texOffs(18, 196).addBox(-0.5935F, -0.3645F, -0.3844F, 0.987F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0967F, 5.0439F, -1.3884F, 0.0F, 0.7418F, 1.6581F));
		PartDefinition bone14_r3 = bone14.addOrReplaceChild("bone14_r3", CubeListBuilder.create().texOffs(48, 194).addBox(-0.5935F, -0.3645F, -0.3844F, 1.187F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1722F, 4.1801F, -0.8623F, 0.0F, 0.3491F, 1.6581F));
		PartDefinition bone14_r4 = bone14.addOrReplaceChild("bone14_r4",
				CubeListBuilder.create().texOffs(0, 188).addBox(4.2525F, -0.3645F, -1.0038F, 1.187F, 0.729F, 0.9688F, new CubeDeformation(0.0F)).texOffs(22, 88).addBox(-1.5795F, -0.3645F, -1.0038F, 5.832F, 0.729F, 1.7488F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, -1.0431F, 0.0F, 0.0F, 1.6581F));
		PartDefinition bone16 = hair2.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1942F, 73.8943F, 1.7535F, -0.0073F, -0.0059F, 0.4327F));
		PartDefinition bone16_r1 = bone16.addOrReplaceChild("bone16_r1", CubeListBuilder.create().texOffs(4, 199).addBox(-0.058F, -0.3645F, -0.3954F, 0.616F, 0.729F, 0.7907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0669F, 5.3844F, -1.7576F, 0.0F, -0.2618F, -1.6581F));
		PartDefinition bone16_r2 = bone16.addOrReplaceChild("bone16_r2", CubeListBuilder.create().texOffs(14, 196).addBox(-0.3935F, -0.3645F, -0.3844F, 0.987F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0967F, 5.0439F, -1.3884F, 0.0F, -0.7418F, -1.6581F));
		PartDefinition bone16_r3 = bone16.addOrReplaceChild("bone16_r3", CubeListBuilder.create().texOffs(48, 192).addBox(-0.5935F, -0.3645F, -0.3844F, 1.187F, 0.729F, 0.7688F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1722F, 4.1801F, -0.8623F, 0.0F, -0.3491F, -1.6581F));
		PartDefinition bone16_r4 = bone16.addOrReplaceChild("bone16_r4", CubeListBuilder.create().texOffs(76, 184).addBox(-5.4395F, -0.3645F, -1.0038F, 1.187F, 0.729F, 0.9688F, new CubeDeformation(0.0F)).texOffs(22, 85).addBox(-4.2525F, -0.3645F,
				-1.0038F, 5.832F, 0.729F, 1.7488F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.58F, -0.4808F, -1.0431F, 0.0F, 0.0F, -1.6581F));
		PartDefinition bone2 = hair2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9802F, 73.7803F, 2.6905F, 0.118F, -0.6734F, -0.3306F));
		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(57, 200).addBox(-0.708F, -0.3645F, -0.7664F, 0.916F, 0.729F, 1.5328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1078F, 4.5687F, 1.7263F, 0.0F, -0.2618F, 1.789F));
		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(20, 166).addBox(-1.458F, -0.3645F, -0.5164F, 1.416F, 0.729F, 1.5327F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0118F, 4.1356F, 1.3192F, 0.0F, 0.0F, 1.789F));
		PartDefinition bone2_r3 = bone2.addOrReplaceChild("bone2_r3", CubeListBuilder.create().texOffs(36, 166).addBox(-0.4935F, -0.3645F, -0.9164F, 1.187F, 0.729F, 1.5328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2148F, 5.0512F, 1.747F, 0.0F, -1.4835F, 1.789F));
		PartDefinition bone2_r4 = bone2.addOrReplaceChild("bone2_r4", CubeListBuilder.create().texOffs(2, 196).addBox(-0.4935F, -0.3645F, -0.4164F, 0.987F, 0.729F, 0.8328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2644F, 5.2753F, 1.0929F, 0.0F, -0.829F, 1.789F));
		PartDefinition bone2_r5 = bone2.addOrReplaceChild("bone2_r5", CubeListBuilder.create().texOffs(6, 196).addBox(-0.8435F, -0.3645F, -0.3664F, 0.987F, 0.729F, 0.8327F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1997F, 4.9832F, 0.7314F, 0.0F, -0.3927F, 1.789F));
		PartDefinition bone2_r6 = bone2.addOrReplaceChild("bone2_r6", CubeListBuilder.create().texOffs(10, 186).addBox(-1.0935F, -0.3645F, -0.2164F, 1.687F, 0.729F, 0.7328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0671F, 3.7798F, 0.2865F, 0.0F, 0.0F, 1.789F));
		PartDefinition bone2_r7 = bone2.addOrReplaceChild("bone2_r7", CubeListBuilder.create().texOffs(14, 93).addBox(-3.2525F, -0.3645F, 0.057F, 4.832F, 0.729F, 2.0907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5405F, -0.4808F, 0.0131F, 0.0F, 0.0F, -1.6581F));
		PartDefinition bone2_r8 = bone2.addOrReplaceChild("bone2_r8", CubeListBuilder.create().texOffs(28, 93).addBox(-1.5795F, -0.3645F, 0.057F, 4.832F, 0.729F, 2.0907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, 0.0131F, 0.0F, 0.0F, 1.6581F));
		PartDefinition bone19 = hair2.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9802F, 73.7803F, 2.6905F, 0.118F, 0.6734F, 0.3306F));
		PartDefinition bone19_r1 = bone19.addOrReplaceChild("bone19_r1", CubeListBuilder.create().texOffs(65, 150).addBox(-1.458F, -0.3645F, -0.5164F, 2.916F, 0.729F, 1.0327F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0118F, 4.1356F, 1.3192F, 0.0F, 0.0F, -1.789F));
		PartDefinition bone19_r2 = bone19.addOrReplaceChild("bone19_r2", CubeListBuilder.create().texOffs(24, 188).addBox(-0.6435F, -0.3645F, -0.3664F, 1.487F, 0.729F, 0.7328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1997F, 4.9832F, 0.7314F, 0.0F, 0.3927F, -1.789F));
		PartDefinition bone19_r3 = bone19.addOrReplaceChild("bone19_r3", CubeListBuilder.create().texOffs(10, 184).addBox(-0.5935F, -0.3645F, -0.2164F, 1.687F, 0.729F, 0.7328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0671F, 3.7798F, 0.2865F, 0.0F, 0.0F, -1.789F));
		PartDefinition bone19_r4 = bone19.addOrReplaceChild("bone19_r4", CubeListBuilder.create().texOffs(0, 93).addBox(-3.2525F, -0.3645F, 0.057F, 4.832F, 0.729F, 2.0907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.58F, -0.4808F, 0.0131F, 0.0F, 0.0F, -1.6581F));
		PartDefinition bone92 = hair2.addOrReplaceChild("bone92", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0642F, 77.9113F, 4.6102F, 1.204F, -1.2881F, -1.3775F));
		PartDefinition bone92_r1 = bone92.addOrReplaceChild("bone92_r1", CubeListBuilder.create().texOffs(44, 186).addBox(-0.486F, -0.8505F, -0.8809F, 0.972F, 1.215F, 1.0118F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.155F, 0.4537F, -0.6815F, -0.0229F, -0.1289F, 1.8341F));
		PartDefinition bone92_r2 = bone92.addOrReplaceChild("bone92_r2", CubeListBuilder.create().texOffs(78, 179).addBox(-0.586F, -0.6075F, -0.4489F, 1.272F, 1.215F, 0.8977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1428F, 0.2989F, -0.3351F, -0.0208F, 0.6119F, 1.7759F));
		PartDefinition bone92_r3 = bone92.addOrReplaceChild("bone92_r3", CubeListBuilder.create().texOffs(44, 184).addBox(-0.686F, -0.6075F, 0.3511F, 1.172F, 1.215F, 0.8978F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.348F, -0.5965F, -0.7757F, -0.0173F, 0.1756F, 1.7848F));
		PartDefinition bone92_r4 = bone92.addOrReplaceChild("bone92_r4", CubeListBuilder.create().texOffs(50, 166).addBox(-0.486F, -0.8505F, -1.1239F, 0.972F, 1.215F, 1.4977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0692F, -0.4779F, -0.5611F, -0.0172F, -0.1298F, 1.7901F));
		PartDefinition bone92_r5 = bone92.addOrReplaceChild("bone92_r5", CubeListBuilder.create().texOffs(16, 62).addBox(-5.6888F, -0.3981F, -1.6994F, 5.29F, 1.701F, 2.9768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, 0.0131F, 0.0F, -0.1309F, 1.6581F));
		PartDefinition bone93 = hair2.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8238F, 76.4533F, 4.1242F, 1.6013F, -1.3317F, -1.3823F));
		PartDefinition bone93_r1 = bone93.addOrReplaceChild("bone93_r1", CubeListBuilder.create().texOffs(54, 175).addBox(-0.786F, -0.6075F, -0.5164F, 1.272F, 1.215F, 1.0328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.109F, 2.5542F, -1.0732F, 0.0F, 0.3491F, 1.7453F));
		PartDefinition bone93_r2 = bone93.addOrReplaceChild("bone93_r2", CubeListBuilder.create().texOffs(34, 173).addBox(-0.879F, -0.6075F, -0.5809F, 1.758F, 1.215F, 0.8617F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1256F, 2.6485F, -0.1356F, 0.0F, 0.7418F, 1.7453F));
		PartDefinition bone93_r3 = bone93.addOrReplaceChild("bone93_r3", CubeListBuilder.create().texOffs(0, 207).addBox(-0.879F, -0.6075F, 0.2691F, 1.758F, 1.215F, 0.5617F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1342F, 1.1749F, 0.0444F, 0.0F, 0.2182F, 1.7453F));
		PartDefinition bone93_r4 = bone93.addOrReplaceChild("bone93_r4", CubeListBuilder.create().texOffs(66, 146).addBox(-1.1505F, -0.729F, -1.1239F, 1.758F, 1.215F, 1.6618F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0396F, 1.4607F, -0.1987F, 0.0F, 0.1309F, 1.7453F));
		PartDefinition bone93_r5 = bone93.addOrReplaceChild("bone93_r5", CubeListBuilder.create().texOffs(16, 81).addBox(-4.2525F, -0.3645F, -1.215F, 5.318F, 1.458F, 2.2477F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, 0.0131F, 0.0F, 0.0F, 1.6581F));
		PartDefinition bone94 = hair2.addOrReplaceChild("bone94", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3352F, 78.3973F, 4.8532F, 1.185F, 1.2091F, 1.4954F));
		PartDefinition bone94_r1 = bone94.addOrReplaceChild("bone94_r1", CubeListBuilder.create().texOffs(72, 104).addBox(-1.944F, -0.6075F, -1.215F, 2.916F, 1.215F, 2.43F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9551F, -5.1201F, -1.4803F, 0.0077F, 0.1744F, -1.6138F));
		PartDefinition bone94_r2 = bone94.addOrReplaceChild("bone94_r2", CubeListBuilder.create().texOffs(45, 205).addBox(-0.3645F, -0.6075F, -0.4825F, 1.029F, 1.215F, 0.965F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0655F, 0.3607F, 0.5451F, -0.0433F, 0.5191F, -1.8945F));
		PartDefinition bone94_r3 = bone94.addOrReplaceChild("bone94_r3", CubeListBuilder.create().texOffs(48, 184).addBox(-0.736F, -0.6075F, -0.372F, 1.372F, 1.215F, 0.744F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0691F, 0.4547F, -0.2561F, -0.088F, 1.1289F, -1.9526F));
		PartDefinition bone94_r4 = bone94.addOrReplaceChild("bone94_r4", CubeListBuilder.create().texOffs(12, 188).addBox(-0.786F, -0.6075F, -0.522F, 1.272F, 1.215F, 0.744F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2193F, -0.3751F, -1.0089F, -0.0458F, 0.6063F, -1.8991F));
		PartDefinition bone94_r5 = bone94.addOrReplaceChild("bone94_r5", CubeListBuilder.create().texOffs(32, 184).addBox(-0.486F, -0.6075F, -0.722F, 0.972F, 1.215F, 1.044F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4652F, -1.1396F, -1.1996F, -0.0399F, 0.3448F, -1.8865F));
		PartDefinition bone94_r6 = bone94.addOrReplaceChild("bone94_r6", CubeListBuilder.create().texOffs(27, 209).addBox(-0.486F, -0.6075F, -0.722F, 0.972F, 1.215F, 1.444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3162F, -0.3668F, -0.0604F, -0.0399F, 0.3448F, -1.8865F));
		PartDefinition bone94_r7 = bone94.addOrReplaceChild("bone94_r7", CubeListBuilder.create().texOffs(40, 208).addBox(2.215F, -0.6075F, -0.715F, 0.972F, 1.215F, 1.444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2425F, 1.3952F, 0.1761F, -0.0381F, 0.1704F, -1.8795F));
		PartDefinition bone94_r8 = bone94.addOrReplaceChild("bone94_r8", CubeListBuilder.create().texOffs(30, 112).addBox(1.0998F, -0.4034F, -1.8775F, 1.874F, 1.215F, 2.43F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.58F, -0.4808F, 0.0131F, -0.0154F, 0.1739F, -1.7467F));
		PartDefinition bone95 = hair2.addOrReplaceChild("bone95", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2512F, 76.9393F, 4.1485F, 0.5134F, -1.0507F, -0.7021F));
		PartDefinition bone95_r1 = bone95.addOrReplaceChild("bone95_r1", CubeListBuilder.create().texOffs(54, 199).addBox(-0.4575F, -0.486F, -0.2629F, 0.715F, 0.972F, 0.4257F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2393F, 2.3073F, 0.9642F, 0.0F, -0.2182F, 1.8326F));
		PartDefinition bone95_r2 = bone95.addOrReplaceChild("bone95_r2", CubeListBuilder.create().texOffs(34, 199).addBox(-0.6075F, -0.486F, -0.1309F, 0.915F, 0.972F, 0.3617F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.238F, 2.3884F, 0.6971F, 0.0F, -0.5236F, 1.789F));
		PartDefinition bone95_r3 = bone95.addOrReplaceChild("bone95_r3", CubeListBuilder.create().texOffs(32, 199).addBox(-0.6075F, -0.486F, -0.3809F, 1.215F, 0.972F, 0.2618F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4815F, 1.29F, 0.5497F, 0.0F, -0.1745F, 1.789F));
		PartDefinition bone95_r4 = bone95.addOrReplaceChild("bone95_r4", CubeListBuilder.create().texOffs(42, 188).addBox(2.3085F, -0.6075F, 0.271F, 1.215F, 0.972F, 0.7618F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9777F, -1.5096F, 0.0131F, 0.0F, 0.0F, 1.789F));
		PartDefinition bone95_r5 = bone95.addOrReplaceChild("bone95_r5", CubeListBuilder.create().texOffs(66, 93).addBox(-4.7385F, -0.6075F, 0.056F, 6.047F, 0.972F, 0.9768F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.58F, -0.4808F, 0.0131F, 0.0F, 0.0F, 1.6581F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9443F, -4.8052F, -0.3696F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RightArm_r1 = LeftArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(32, 97).addBox(-1.394F, -0.8228F, -1.386F, 2.63F, 0.8456F, 2.772F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1356F, 0.3081F, 0.0975F, 0.0F, 0.0F, 0.2182F));
		PartDefinition RightArm_r2 = LeftArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(54, 77).addBox(-1.5246F, -4.9826F, -1.386F, 2.472F, 5.0456F, 2.772F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5309F, 4.8174F, 0.0924F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone21 = LeftArm.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(4.77F, -10.2679F, -2.2514F));
		PartDefinition bone13_r7 = bone21.addOrReplaceChild("bone13_r7", CubeListBuilder.create().texOffs(40, 199).addBox(-0.185F, -1.8214F, -0.1423F, 0.4746F, 0.9676F, 0.5692F, new CubeDeformation(0.0F)).texOffs(96, 196).addBox(-0.3273F, -0.8538F,
				-0.1423F, 0.7534F, 1.2439F, 0.5692F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2145F, 12.7598F, 3.9309F, 0.1752F, 0.9279F, -0.0443F));
		PartDefinition bone13_r8 = bone21.addOrReplaceChild("bone13_r8", CubeListBuilder.create().texOffs(8, 130).addBox(-1.6155F, -2.5728F, -0.4269F, 2.7384F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3266F, 12.69F, 4.0954F, 0.2182F, 0.0F, -0.0436F));
		PartDefinition bone13_r9 = bone21.addOrReplaceChild("bone13_r9", CubeListBuilder.create().texOffs(42, 199).addBox(-0.185F, -1.8214F, -0.4269F, 0.4746F, 0.9676F, 0.5692F, new CubeDeformation(0.0F)).texOffs(100, 196).addBox(-0.3273F, -0.8538F,
				-0.4269F, 0.7534F, 1.2439F, 0.5692F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2145F, 12.7598F, 0.8307F, -0.1752F, -0.9279F, -0.0443F));
		PartDefinition bone13_r10 = bone21.addOrReplaceChild("bone13_r10", CubeListBuilder.create().texOffs(0, 162).addBox(-1.6155F, -0.9628F, -0.4269F, 2.7384F, 0.9964F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2963F, 13.3845F, 3.6201F, -0.7854F, 0.0F, -0.0436F));
		PartDefinition bone13_r11 = bone21.addOrReplaceChild("bone13_r11", CubeListBuilder.create().texOffs(0, 164).addBox(-1.6155F, -0.9628F, -0.4269F, 2.7384F, 0.9964F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2963F, 13.3845F, 1.1415F, 0.7854F, 0.0F, -0.0436F));
		PartDefinition bone13_r12 = bone21.addOrReplaceChild("bone13_r12", CubeListBuilder.create().texOffs(8, 134).addBox(-1.6155F, -2.5728F, -0.4269F, 2.7384F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3266F, 12.69F, 0.6662F, -0.2182F, 0.0F, -0.0436F));
		PartDefinition bone13_r13 = bone21.addOrReplaceChild("bone13_r13", CubeListBuilder.create().texOffs(48, 142).addBox(-1.4218F, -2.154F, -0.3777F, 2.8459F, 3.4863F, 0.2846F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1699F, 12.4358F, 2.3844F, 2.3211F, -1.5629F, -2.2482F));
		PartDefinition bone13_r14 = bone21.addOrReplaceChild("bone13_r14", CubeListBuilder.create().texOffs(20, 153).addBox(-1.423F, -0.3057F, -0.4269F, 2.8459F, 1.0734F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9563F, 12.8086F, 2.4045F, 3.0628F, -1.5629F, -2.2482F));
		PartDefinition bone13_r15 = bone21.addOrReplaceChild("bone13_r15", CubeListBuilder.create().texOffs(48, 125).addBox(-1.423F, -1.4344F, -0.2344F, 2.8459F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0911F, 11.4754F, 2.3956F, -1.1696F, -1.5787F, 0.8934F));
		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(-1.7712F, 2.9286F, 4.2915F));
		PartDefinition bone16_r5 = bone22.addOrReplaceChild("bone16_r5", CubeListBuilder.create().texOffs(44, 173).addBox(-1.463F, -0.616F, -0.2695F, 2.5335F, 0.616F, 0.539F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4834F, 11.8681F, -0.4568F, 0.2182F, 0.0F, -0.0436F));
		PartDefinition bone16_r6 = bone22.addOrReplaceChild("bone16_r6", CubeListBuilder.create().texOffs(28, 174).addBox(-1.309F, -0.7005F, 0.0385F, 2.926F, 0.693F, 0.308F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2489F, 11.7783F, -2.2187F, 0.0F, -1.5708F, -0.3054F));
		PartDefinition bone16_r7 = bone22.addOrReplaceChild("bone16_r7", CubeListBuilder.create().texOffs(28, 172).addBox(-3.157F, -0.6244F, -2.0018F, 2.926F, 0.693F, 0.308F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2335F, 12.1172F, -3.6047F, 0.0F, 1.5708F, 0.1309F));
		PartDefinition bone16_r8 = bone22.addOrReplaceChild("bone16_r8", CubeListBuilder.create().texOffs(92, 93).addBox(-1.5015F, 0.231F, -1.617F, 2.726F, 0.616F, 3.234F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6964F, 10.5197F, -1.9107F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone16_r9 = bone22.addOrReplaceChild("bone16_r9", CubeListBuilder.create().texOffs(0, 175).addBox(-1.463F, -0.462F, -0.2695F, 2.5335F, 0.616F, 0.539F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.49F, 11.7179F, -3.3312F, -0.2182F, 0.0F, -0.0436F));
		PartDefinition LeftForeArm = LeftArm.addOrReplaceChild("LeftForeArm", CubeListBuilder.create(), PartPose.offset(0.2809F, 5.0104F, 0.0924F));
		PartDefinition RightHand_r1 = LeftForeArm.addOrReplaceChild("RightHand_r1", CubeListBuilder.create().texOffs(42, 107).addBox(-1.386F, -1.4553F, -1.386F, 2.472F, 1.9656F, 1.953F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1164F, -0.0751F, 0.6231F, 0.7854F, 0.0F, -0.0436F));
		PartDefinition RightForeArm_r1 = LeftForeArm.addOrReplaceChild("RightForeArm_r1", CubeListBuilder.create().texOffs(0, 85).addBox(-1.5246F, 0.693F, -1.386F, 2.472F, 4.8681F, 2.772F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2225F, -0.8224F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftHand = LeftForeArm.addOrReplaceChild("LeftHand", CubeListBuilder.create(), PartPose.offset(0.3687F, 4.7628F, -0.0003F));
		PartDefinition RightHand_r2 = LeftHand.addOrReplaceChild("RightHand_r2", CubeListBuilder.create().texOffs(42, 103).addBox(-1.386F, -1.4553F, -1.386F, 2.472F, 1.9656F, 1.953F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.04F, 0.0256F, 0.6234F, 0.7854F, 0.0F, -0.0436F));
		PartDefinition RightHand_r3 = LeftHand.addOrReplaceChild("RightHand_r3", CubeListBuilder.create().texOffs(10, 97).addBox(-1.5246F, 6.111F, -1.386F, 2.472F, 1.6506F, 2.772F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1702F, -6.1346F, 0.0003F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftHandLocator = LeftHand.addOrReplaceChild("LeftHandLocator", CubeListBuilder.create(), PartPose.offset(-0.161F, 1.215F, 0.309F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9443F, -4.8052F, -0.3696F, 0.0F, 0.0F, 0.1309F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(32, 97).mirror().addBox(-1.236F, -0.8228F, -1.386F, 2.63F, 0.8456F, 2.772F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1356F, 0.3081F, 0.0975F, 0.0F, 0.0F, -0.2182F));
		PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.9474F, -4.9826F, -1.386F, 2.472F, 5.0456F, 2.772F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5309F, 4.8174F, 0.0924F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone12 = RightArm.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-4.77F, -10.2679F, -2.2514F));
		PartDefinition bone14_r5 = bone12.addOrReplaceChild("bone14_r5", CubeListBuilder.create().texOffs(40, 199).mirror().addBox(-0.2896F, -1.8214F, -0.1423F, 0.4746F, 0.9676F, 0.5692F, new CubeDeformation(0.0F)).mirror(false).texOffs(96, 196)
				.mirror().addBox(-0.4261F, -0.8538F, -0.1423F, 0.7534F, 1.2439F, 0.5692F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2145F, 12.7598F, 3.9309F, 0.1752F, -0.9279F, 0.0443F));
		PartDefinition bone14_r6 = bone12.addOrReplaceChild("bone14_r6", CubeListBuilder.create().texOffs(8, 130).mirror().addBox(-1.123F, -2.5728F, -0.4269F, 2.7384F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3266F, 12.69F, 4.0954F, 0.2182F, 0.0F, 0.0436F));
		PartDefinition bone14_r7 = bone12.addOrReplaceChild("bone14_r7", CubeListBuilder.create().texOffs(42, 199).mirror().addBox(-0.2896F, -1.8214F, -0.4269F, 0.4746F, 0.9676F, 0.5692F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 196)
				.mirror().addBox(-0.4261F, -0.8538F, -0.4269F, 0.7534F, 1.2439F, 0.5692F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2145F, 12.7598F, 0.8307F, -0.1752F, 0.9279F, 0.0443F));
		PartDefinition bone14_r8 = bone12.addOrReplaceChild("bone14_r8", CubeListBuilder.create().texOffs(0, 162).mirror().addBox(-1.123F, -0.9628F, -0.4269F, 2.7384F, 0.9964F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2963F, 13.3845F, 3.6201F, -0.7854F, 0.0F, 0.0436F));
		PartDefinition bone14_r9 = bone12.addOrReplaceChild("bone14_r9", CubeListBuilder.create().texOffs(0, 164).mirror().addBox(-1.123F, -0.9628F, -0.4269F, 2.7384F, 0.9964F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2963F, 13.3845F, 1.1415F, 0.7854F, 0.0F, 0.0436F));
		PartDefinition bone14_r10 = bone12.addOrReplaceChild("bone14_r10", CubeListBuilder.create().texOffs(8, 134).mirror().addBox(-1.123F, -2.5728F, -0.4269F, 2.7384F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3266F, 12.69F, 0.6662F, -0.2182F, 0.0F, 0.0436F));
		PartDefinition bone14_r11 = bone12.addOrReplaceChild("bone14_r11", CubeListBuilder.create().texOffs(48, 142).mirror().addBox(-1.4241F, -2.154F, -0.3777F, 2.8459F, 3.4863F, 0.2846F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.1699F, 12.4358F, 2.3844F, 2.3211F, 1.5629F, 2.2482F));
		PartDefinition bone14_r12 = bone12.addOrReplaceChild("bone14_r12", CubeListBuilder.create().texOffs(20, 153).mirror().addBox(-1.423F, -0.3057F, -0.4269F, 2.8459F, 1.0734F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.9563F, 12.8086F, 2.4045F, 3.0628F, 1.5629F, 2.2482F));
		PartDefinition bone14_r13 = bone12.addOrReplaceChild("bone14_r13", CubeListBuilder.create().texOffs(48, 125).mirror().addBox(-1.423F, -1.4344F, -0.2344F, 2.8459F, 2.9914F, 0.8538F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0911F, 11.4754F, 2.3956F, -1.1696F, 1.5787F, -0.8934F));
		PartDefinition bone15 = bone12.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(1.7712F, 2.9286F, 4.2915F));
		PartDefinition bone17_r5 = bone15.addOrReplaceChild("bone17_r5", CubeListBuilder.create().texOffs(44, 173).mirror().addBox(-1.0705F, -0.616F, -0.2695F, 2.5335F, 0.616F, 0.539F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4834F, 11.8681F, -0.4568F, 0.2182F, 0.0F, 0.0436F));
		PartDefinition bone17_r6 = bone15.addOrReplaceChild("bone17_r6", CubeListBuilder.create().texOffs(28, 174).mirror().addBox(-1.617F, -0.7005F, 0.0385F, 2.926F, 0.693F, 0.308F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2489F, 11.7783F, -2.2187F, 0.0F, 1.5708F, 0.3054F));
		PartDefinition bone17_r7 = bone15.addOrReplaceChild("bone17_r7", CubeListBuilder.create().texOffs(28, 172).mirror().addBox(0.231F, -0.6244F, -2.0018F, 2.926F, 0.693F, 0.308F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2335F, 12.1172F, -3.6047F, 0.0F, -1.5708F, -0.1309F));
		PartDefinition bone17_r8 = bone15.addOrReplaceChild("bone17_r8", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-1.2245F, 0.231F, -1.617F, 2.726F, 0.616F, 3.234F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6964F, 10.5197F, -1.9107F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone17_r9 = bone15.addOrReplaceChild("bone17_r9", CubeListBuilder.create().texOffs(0, 175).mirror().addBox(-1.0705F, -0.462F, -0.2695F, 2.5335F, 0.616F, 0.539F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.49F, 11.7179F, -3.3312F, -0.2182F, 0.0F, 0.0436F));
		PartDefinition RightForeArm = RightArm.addOrReplaceChild("RightForeArm", CubeListBuilder.create(), PartPose.offset(-0.2809F, 5.0104F, 0.0924F));
		PartDefinition RightHand_r4 = RightForeArm.addOrReplaceChild("RightHand_r4", CubeListBuilder.create().texOffs(42, 107).mirror().addBox(-1.086F, -1.4553F, -1.386F, 2.472F, 1.9656F, 1.953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1164F, -0.0751F, 0.6231F, 0.7854F, 0.0F, 0.0436F));
		PartDefinition RightForeArm_r2 = RightForeArm.addOrReplaceChild("RightForeArm_r2", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.9474F, 0.693F, -1.386F, 2.472F, 4.8681F, 2.772F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2225F, -0.8224F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightHand = RightForeArm.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-0.3687F, 4.7628F, -0.0003F));
		PartDefinition RightHand_r5 = RightHand.addOrReplaceChild("RightHand_r5", CubeListBuilder.create().texOffs(42, 103).mirror().addBox(-1.086F, -1.4553F, -1.386F, 2.472F, 1.9656F, 1.953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.04F, 0.0256F, 0.6234F, 0.7854F, 0.0F, 0.0436F));
		PartDefinition RightHand_r6 = RightHand.addOrReplaceChild("RightHand_r6", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.9474F, 6.111F, -1.386F, 2.472F, 1.6506F, 2.772F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1702F, -6.1346F, 0.0003F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightHandLocator = RightHand.addOrReplaceChild("RightHandLocator", CubeListBuilder.create(), PartPose.offset(0.161F, 1.215F, 0.309F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(60, 29).addBox(-1.96F, -1.0F, -1.708F, 3.98F, 9.4F, 3.416F, new CubeDeformation(0.0F)), PartPose.offset(-2.16F, 6.2F, -0.28F));
		PartDefinition RightLowerLeg = RightLeg.addOrReplaceChild("RightLowerLeg",
				CubeListBuilder.create().texOffs(79, 63).addBox(-1.82F, 0.0F, -1.778F, 3.84F, 9.4F, 3.416F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-1.97F, 4.75F, -2.128F, 4.09F, 1.65F, 4.116F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.4F, 0.07F));
		PartDefinition RightLowerLeg_r1 = RightLowerLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(62, 130).addBox(-1.82F, 1.8F, -1.708F, 3.84F, 2.4F, 2.416F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.7621F, 2.3996F, -0.7854F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(46, 29).addBox(-2.02F, -1.0F, -1.708F, 3.98F, 9.4F, 3.416F, new CubeDeformation(0.0F)), PartPose.offset(2.16F, 6.2F, -0.28F));
		PartDefinition LeftLowerLeg = LeftLeg.addOrReplaceChild("LeftLowerLeg",
				CubeListBuilder.create().texOffs(0, 41).addBox(-2.02F, 0.0F, -1.778F, 3.84F, 9.4F, 3.416F, new CubeDeformation(0.0F)).texOffs(78, 53).addBox(-2.12F, 4.75F, -2.128F, 4.09F, 1.65F, 4.116F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.4F, 0.07F));
		PartDefinition RightLowerLeg_r2 = LeftLowerLeg.addOrReplaceChild("RightLowerLeg_r2", CubeListBuilder.create().texOffs(84, 107).addBox(-2.03F, 1.8F, -1.708F, 3.85F, 2.4F, 2.416F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, -1.7734F, 2.4102F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.5F));
		PartDefinition AllBody = Root.addOrReplaceChild("AllBody", CubeListBuilder.create(), PartPose.offset(0.0F, -21.86F, 0.22F));
		PartDefinition UpBody = AllBody.addOrReplaceChild("UpBody",
				CubeListBuilder.create().texOffs(68, 41).addBox(-3.92F, -1.94F, -1.47F, 7.84F, 1.8F, 2.94F, new CubeDeformation(0.0F)).texOffs(0, 53).addBox(-3.892F, -2.78F, -1.4F, 7.784F, 0.84F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.12F, 0.0F));
		PartDefinition UpBody_r1 = UpBody.addOrReplaceChild("UpBody_r1", CubeListBuilder.create().texOffs(8, 114).addBox(-0.42F, -1.4F, -1.22F, 0.84F, 1.8F, 2.94F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7596F, -0.4981F, -0.238F, 0.0F, 0.0F, 0.0873F));
		PartDefinition UpBody_r2 = UpBody.addOrReplaceChild("UpBody_r2", CubeListBuilder.create().texOffs(18, 112).addBox(-0.42F, -1.4F, -1.22F, 0.84F, 1.8F, 2.94F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7596F, -0.4981F, -0.238F, 0.0F, 0.0F, -0.0873F));
		PartDefinition UpBody_r3 = UpBody.addOrReplaceChild("UpBody_r3", CubeListBuilder.create().texOffs(50, 89).addBox(-7.3368F, -3.7263F, -2.1691F, 6.34F, 2.8F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, 4.2123F, 0.3491F, 0.0F, 0.0F));
		PartDefinition UpBody_r4 = UpBody.addOrReplaceChild("UpBody_r4", CubeListBuilder.create().texOffs(64, 188).addBox(-0.2592F, -3.2263F, -2.4189F, 0.99F, 2.3F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, 4.2123F, 0.3753F, 0.3678F, 0.1407F));
		PartDefinition UpBody_r5 = UpBody.addOrReplaceChild("UpBody_r5", CubeListBuilder.create().texOffs(62, 188).addBox(-8.43F, -3.2263F, 0.7702F, 0.99F, 2.3F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, 4.2123F, 0.3753F, -0.3678F, -0.1407F));
		PartDefinition UpBody_r6 = UpBody.addOrReplaceChild("UpBody_r6", CubeListBuilder.create().texOffs(62, 190).addBox(-8.43F, -3.2263F, -1.2102F, 0.99F, 2.3F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, -4.1523F, -0.3753F, 0.3678F, -0.1407F));
		PartDefinition UpBody_r7 = UpBody.addOrReplaceChild("UpBody_r7", CubeListBuilder.create().texOffs(64, 190).addBox(-0.2592F, -3.2263F, 1.9789F, 0.99F, 2.3F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, -4.1523F, -0.3753F, -0.3678F, 0.1407F));
		PartDefinition UpBody_r8 = UpBody.addOrReplaceChild("UpBody_r8", CubeListBuilder.create().texOffs(62, 85).addBox(-7.3368F, -3.7263F, 1.7291F, 6.34F, 2.8F, 0.44F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1668F, 0.7186F, -4.1523F, -0.3491F, 0.0F, 0.0F));
		PartDefinition UpperBody = UpBody.addOrReplaceChild("UpperBody",
				CubeListBuilder.create().texOffs(0, 29).addBox(-4.02F, -2.83F, -1.68F, 8.04F, 2.8F, 3.36F, new CubeDeformation(0.0F)).texOffs(68, 46).addBox(-3.892F, -3.67F, -1.54F, 7.784F, 0.84F, 3.08F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.91F, 0.0F));
		PartDefinition Arm = UpperBody.addOrReplaceChild("Arm", CubeListBuilder.create(), PartPose.offset(-0.0297F, -4.6917F, 2.3051F));
		PartDefinition shang_ban_shen_high = UpperBody.addOrReplaceChild("shang_ban_shen_high",
				CubeListBuilder.create().texOffs(87, 30).addBox(-7.2832F, -8.7532F, -3.162F, 7.84F, 3.08F, 3.36F, new CubeDeformation(0.0F)).texOffs(104, 93).addBox(-5.0432F, -10.4332F, -2.602F, 3.36F, 1.68F, 2.24F, new CubeDeformation(0.0F)),
				PartPose.offset(3.3632F, 2.8432F, 1.482F));
		PartDefinition shang_ban_shen_high_r1 = shang_ban_shen_high.addOrReplaceChild("shang_ban_shen_high_r1", CubeListBuilder.create().texOffs(8, 112).addBox(-2.18F, -0.34F, -0.07F, 4.36F, 1.48F, 0.74F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3632F, -9.0932F, -0.232F, -0.2182F, 0.0F, 0.0F));
		PartDefinition chi_bang = shang_ban_shen_high.addOrReplaceChild("chi_bang", CubeListBuilder.create(), PartPose.offset(-3.3632F, -12.0332F, -1.232F));
		PartDefinition chi_bang_right = chi_bang.addOrReplaceChild("chi_bang_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0245F, 7.3272F, 2.084F, 0.1609F, 0.4289F, -0.0529F));
		PartDefinition cube_r16 = chi_bang_right.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 188).addBox(-0.25F, -2.5F, -0.5F, 0.5F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9654F, -1.2706F, 0.5F, 0.0F, 0.0F, -2.8798F));
		PartDefinition cube_r17 = chi_bang_right.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(4, 112).addBox(-0.5F, -5.25F, -0.5F, 1.0F, 7.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.3822F, -8.0179F, 0.5F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r18 = chi_bang_right.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 192).addBox(-0.25F, -0.75F, -0.5F, 0.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.1612F, -4.8897F, 0.5F, 0.0F, 0.0F, -2.4871F));
		PartDefinition cube_r19 = chi_bang_right.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 204).addBox(-0.25F, -0.25F, -0.5F, 0.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5894F, -5.4736F, 0.5F, 0.0F, 0.0F, -1.8762F));
		PartDefinition cube_r20 = chi_bang_right.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(74, 179).addBox(0.5F, -1.25F, -0.5F, 0.5F, 2.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4685F, -4.8411F, 0.5F, 0.0F, 0.0F, -1.3526F));
		PartDefinition cube_r21 = chi_bang_right.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 153).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0046F, -7.0171F, 0.5F, 0.0F, 0.0F, -0.9163F));
		PartDefinition cube_r22 = chi_bang_right.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 103).addBox(-0.5F, -7.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3044F, -1.3967F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition bone25 = chi_bang_right.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(-2.7179F, 2.4615F, 0.5F));
		PartDefinition cube_r23 = bone25.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 179).addBox(-0.65F, -1.05F, -0.3F, 1.7F, 1.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.946F, -3.0288F, 0.0F, 0.0F, 0.0F, -2.7925F));
		PartDefinition cube_r24 = bone25.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 188).addBox(0.3F, -14.75F, -0.3F, 0.65F, 2.55F, 0.6F, new CubeDeformation(0.0F)).texOffs(52, 112)
				.addBox(-2.7F, -8.65F, -0.3F, 2.25F, 5.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(42, 62).addBox(-0.5F, -12.25F, -0.3F, 2.25F, 13.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6574F, -3.776F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r25 = bone25.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(92, 97).addBox(-0.25F, -1.5F, -0.3F, 3.5F, 5.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0071F));
		PartDefinition cube_r26 = bone25.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(2, 199).addBox(0.25F, -0.1F, -0.3F, 0.5F, 1.6F, 0.6F, new CubeDeformation(0.0F)).texOffs(30, 188).addBox(-0.25F, -1.5F, -0.3F, 0.5F, 3.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7083F, 0.4169F, 0.0F, 0.0F, 0.0F, -1.4399F));
		PartDefinition cube_r27 = bone25.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 204).addBox(-0.25F, -1.125F, -0.3F, 0.5F, 3.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1839F, -0.0186F, 0.0F, 0.0F, 0.0F, -1.789F));
		PartDefinition cube_r28 = bone25.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 117).addBox(-0.25F, -1.875F, -0.3F, 4.25F, 3.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0757F, -0.8303F, 0.0F, 0.0F, 0.0F, -1.3526F));
		PartDefinition cube_r29 = bone25.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 204).addBox(-0.25F, -1.25F, -0.3F, 0.5F, 3.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9345F, -2.5461F, 0.0F, 0.0F, 0.0F, -1.0036F));
		PartDefinition cube_r30 = bone25.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 196).addBox(0.0F, -1.25F, -0.3F, 0.5F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8838F, -2.8438F, 0.0F, 0.0F, 0.0F, -1.4399F));
		PartDefinition cube_r31 = bone25.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 192).addBox(-0.35F, -1.25F, -0.3F, 0.6F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8047F, -2.461F, 0.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r32 = bone25.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(26, 166).addBox(-2.0F, 1.25F, -0.3F, 2.5F, 1.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(20, 184).addBox(-0.5F, -1.25F, -0.3F, 1.0F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.621F, -4.0291F, 0.0F, 0.0F, 0.0F, -1.2654F));
		PartDefinition cube_r33 = bone25.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 184).addBox(-0.5F, -1.75F, -0.3F, 1.0F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2911F, -4.7678F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r34 = bone25.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 146).addBox(-0.5F, -2.25F, -0.3F, 2.25F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9104F, -6.7045F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r35 = bone25.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 166).addBox(-0.5F, -3.75F, -0.3F, 1.0F, 4.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.9752F, -9.2539F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition chi_bang_left = chi_bang.addOrReplaceChild("chi_bang_left", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0245F, 7.3272F, 2.084F, 0.1609F, -0.4289F, 0.0529F));
		PartDefinition cube_r36 = chi_bang_left.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 188).addBox(-0.25F, -2.5F, -0.5F, 0.5F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9654F, -1.2706F, 0.5F, 0.0F, 0.0F, 2.8798F));
		PartDefinition cube_r37 = chi_bang_left.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, -5.25F, -0.5F, 1.0F, 7.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.3822F, -8.0179F, 0.5F, 0.0F, 0.0F, 1.2217F));
		PartDefinition cube_r38 = chi_bang_left.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 192).addBox(-0.25F, -0.75F, -0.5F, 0.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.1612F, -4.8897F, 0.5F, 0.0F, 0.0F, 2.4871F));
		PartDefinition cube_r39 = chi_bang_left.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 204).addBox(-0.25F, -0.25F, -0.5F, 0.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5894F, -5.4736F, 0.5F, 0.0F, 0.0F, 1.8762F));
		PartDefinition cube_r40 = chi_bang_left.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(70, 179).addBox(-1.0F, -1.25F, -0.5F, 0.5F, 2.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4685F, -4.8411F, 0.5F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r41 = chi_bang_left.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(8, 153).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0046F, -7.0171F, 0.5F, 0.0F, 0.0F, 0.9163F));
		PartDefinition cube_r42 = chi_bang_left.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -7.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3044F, -1.3967F, 0.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition bone26 = chi_bang_left.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offset(2.7179F, 2.4615F, 0.5F));
		PartDefinition cube_r43 = bone26.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(24, 182).addBox(-1.05F, -1.05F, -0.3F, 1.7F, 1.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.946F, -3.0288F, 0.0F, 0.0F, 0.0F, 2.7925F));
		PartDefinition cube_r44 = bone26.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 188).addBox(-0.95F, -14.75F, -0.3F, 0.65F, 2.55F, 0.6F, new CubeDeformation(0.0F)).texOffs(46, 112)
				.addBox(0.45F, -8.65F, -0.3F, 2.25F, 5.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(36, 62).addBox(-1.75F, -12.25F, -0.3F, 2.25F, 13.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6574F, -3.776F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r45 = bone26.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(84, 97).addBox(-3.25F, -1.5F, -0.3F, 3.5F, 5.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0071F));
		PartDefinition cube_r46 = bone26.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 199).addBox(-0.75F, -0.1F, -0.3F, 0.5F, 1.6F, 0.6F, new CubeDeformation(0.0F)).texOffs(28, 188).addBox(-0.25F, -1.5F, -0.3F, 0.5F, 3.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7083F, 0.4169F, 0.0F, 0.0F, 0.0F, 1.4399F));
		PartDefinition cube_r47 = bone26.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(32, 188).addBox(-0.25F, -1.125F, -0.3F, 0.5F, 3.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1839F, -0.0186F, 0.0F, 0.0F, 0.0F, 1.789F));
		PartDefinition cube_r48 = bone26.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(64, 110).addBox(-4.0F, -1.875F, -0.3F, 4.25F, 3.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0757F, -0.8303F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r49 = bone26.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 179).addBox(-0.25F, -1.25F, -0.3F, 0.5F, 3.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9345F, -2.5461F, 0.0F, 0.0F, 0.0F, 1.0036F));
		PartDefinition cube_r50 = bone26.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 192).addBox(-0.5F, -1.25F, -0.3F, 0.5F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8838F, -2.8438F, 0.0F, 0.0F, 0.0F, 1.4399F));
		PartDefinition cube_r51 = bone26.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(36, 192).addBox(-0.25F, -1.25F, -0.3F, 0.6F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8047F, -2.461F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r52 = bone26.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(15, 202).addBox(-0.5F, 1.25F, -0.3F, 2.5F, 1.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(16, 184).addBox(-0.5F, -1.25F, -0.3F, 1.0F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.621F, -4.0291F, 0.0F, 0.0F, 0.0F, 1.2654F));
		PartDefinition cube_r53 = bone26.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(24, 184).addBox(-0.5F, -1.75F, -0.3F, 1.0F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2911F, -4.7678F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r54 = bone26.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(24, 146).addBox(-1.75F, -2.25F, -0.3F, 2.25F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9104F, -6.7045F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r55 = bone26.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 167).addBox(-0.5F, -3.75F, -0.3F, 1.0F, 4.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.9752F, -9.2539F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition bone165 = UpperBody.addOrReplaceChild("bone165", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3902F, -14.7164F, 4.3496F, -0.2396F, -0.0723F, -0.2166F));
		PartDefinition bone7 = UpperBody.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3902F, -14.7164F, 4.3496F, -0.2396F, 0.0723F, 0.2166F));
		PartDefinition bone7_r3 = bone7.addOrReplaceChild("bone7_r3", CubeListBuilder.create().texOffs(38, 112).addBox(-0.7006F, -0.5957F, -1.4215F, 0.8988F, 1.0656F, 3.0852F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6119F, 9.6825F, -2.0032F, 0.2355F, 0.0215F, -0.269F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9678F, 11.6204F, 0.7296F, -0.5308F, -0.0204F, 0.0846F));
		PartDefinition bone11 = UpperBody.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3902F, -14.7164F, 4.3496F, -0.2396F, -0.0723F, -0.2166F));
		PartDefinition bone11_r2 = bone11.addOrReplaceChild("bone11_r2", CubeListBuilder.create().texOffs(58, 123).addBox(-0.1982F, -0.5957F, -1.4215F, 0.8988F, 1.0656F, 3.0852F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6119F, 9.6825F, -2.0032F, 0.2355F, -0.0215F, 0.269F));
		PartDefinition bone54 = bone11.addOrReplaceChild("bone54", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9678F, 11.6204F, 0.7296F, -0.5308F, 0.0204F, -0.0846F));
		PartDefinition bone50 = UpperBody.addOrReplaceChild("bone50", CubeListBuilder.create(), PartPose.offset(-0.0764F, -3.4184F, -2.0312F));
		PartDefinition bone4 = bone50.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5F, 0.0F, 0.7632F, -0.0723F, 0.2166F));
		PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1", CubeListBuilder.create().texOffs(48, 201).addBox(-0.4196F, -0.198F, 0.9152F, 0.9092F, 0.3959F, 0.4446F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7458F, -0.888F, 1.4962F, 1.5225F, 0.9734F, 1.2565F));
		PartDefinition bone4_r2 = bone4.addOrReplaceChild("bone4_r2", CubeListBuilder.create().texOffs(0, 143).addBox(-0.3846F, -0.198F, -0.7473F, 0.9792F, 0.3959F, 2.7196F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3112F, -0.3754F, 0.9767F, 1.0689F, 0.8752F, 0.6943F));
		PartDefinition bone4_r3 = bone4.addOrReplaceChild("bone4_r3", CubeListBuilder.create().texOffs(0, 179).addBox(-0.2446F, -0.303F, -1.1948F, 0.7892F, 0.6059F, 1.5396F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6633F, 0.692F, -1.0928F, 1.3058F, -0.9494F, -1.5046F));
		PartDefinition bone4_r4 = bone4.addOrReplaceChild("bone4_r4", CubeListBuilder.create().texOffs(46, 188).addBox(0.3154F, -0.303F, 0.4602F, 0.7692F, 0.6059F, 1.1796F, new CubeDeformation(0.0F)).texOffs(8, 139).addBox(-0.3846F, -0.303F,
				-0.7998F, 0.7692F, 0.6059F, 2.7896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0438F, 0.4848F, -0.5341F, 0.7395F, -0.5851F, -0.7225F));
		PartDefinition bone4_r5 = bone4.addOrReplaceChild("bone4_r5", CubeListBuilder.create().texOffs(22, 121).addBox(-1.0246F, -0.403F, -1.2898F, 1.5492F, 0.7059F, 2.5796F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8241F, -0.092F, 0.0909F, 0.6625F, -0.2234F, -0.5097F));
		PartDefinition bone3 = bone50.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8472F, -0.5F, 0.0F, 0.7632F, 0.0723F, -0.2166F));
		PartDefinition bone3_r1 = bone3.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(48, 201).addBox(-0.4896F, -0.198F, 0.9152F, 0.9092F, 0.3959F, 0.4446F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7458F, -0.888F, 1.4962F, 1.5225F, -0.9734F, -1.2565F));
		PartDefinition bone3_r2 = bone3.addOrReplaceChild("bone3_r2", CubeListBuilder.create().texOffs(52, 130).addBox(-0.5946F, -0.198F, -0.7473F, 0.9792F, 0.3959F, 2.7196F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3112F, -0.3754F, 0.9767F, 1.0689F, -0.8752F, -0.6943F));
		PartDefinition bone3_r3 = bone3.addOrReplaceChild("bone3_r3", CubeListBuilder.create().texOffs(70, 175).addBox(-0.5446F, -0.303F, -1.1948F, 0.7892F, 0.6059F, 1.5396F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6633F, 0.692F, -1.0928F, 1.3058F, 0.9494F, 1.5046F));
		PartDefinition bone3_r4 = bone3.addOrReplaceChild("bone3_r4", CubeListBuilder.create().texOffs(42, 190).addBox(-1.0846F, -0.303F, 0.4602F, 0.7692F, 0.6059F, 1.1796F, new CubeDeformation(0.0F)).texOffs(0, 139).addBox(-0.3846F, -0.303F,
				-0.7998F, 0.7692F, 0.6059F, 2.7896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0438F, 0.4848F, -0.5341F, 0.7395F, 0.5851F, 0.7225F));
		PartDefinition bone3_r5 = bone3.addOrReplaceChild("bone3_r5", CubeListBuilder.create().texOffs(12, 124).addBox(-0.5246F, -0.403F, -1.2898F, 1.5492F, 0.7059F, 2.5796F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8241F, -0.092F, 0.0909F, 0.6625F, 0.2234F, 0.5097F));
		PartDefinition bone20 = UpperBody.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(84, 197).addBox(-0.4565F, -0.0344F, -0.3334F, 0.9129F, 0.951F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.9076F, -1.7244F, -0.2182F, 0.0F, 0.0F));
		PartDefinition bone34_r1 = bone20.addOrReplaceChild("bone34_r1", CubeListBuilder.create().texOffs(30, 196).addBox(-1.2172F, -0.4755F, -0.3043F, 1.1647F, 0.7608F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4458F, 1.8619F, -0.0291F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bone34_r2 = bone20.addOrReplaceChild("bone34_r2", CubeListBuilder.create().texOffs(34, 196).addBox(-0.4565F, -0.4755F, -0.3043F, 0.9129F, 1.2189F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1766F, 1.1001F, -0.0291F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone23 = bone20.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(36, 188).addBox(-0.4103F, 0.5987F, -0.7687F, 1.6737F, 0.5706F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.009F, 2.8115F, 0.6125F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone34_r3 = bone23.addOrReplaceChild("bone34_r3", CubeListBuilder.create().texOffs(36, 190).addBox(-0.4565F, -0.7608F, -0.3043F, 1.6737F, 0.5706F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6352F, 1.0379F, -0.4644F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone34_r4 = bone23.addOrReplaceChild("bone34_r4", CubeListBuilder.create().texOffs(26, 168).addBox(-0.4565F, -0.5181F, -0.3043F, 2.6246F, 0.8984F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.597F, -1.0341F, -0.4644F, 0.0F, 0.0F, 0.9163F));
		PartDefinition bone34_r5 = bone23.addOrReplaceChild("bone34_r5", CubeListBuilder.create().texOffs(4, 188).addBox(-0.4565F, -1.3487F, -0.3043F, 0.9129F, 2.3567F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.029F, 0.0125F, -0.4644F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone34_r6 = bone23.addOrReplaceChild("bone34_r6", CubeListBuilder.create().texOffs(50, 168).addBox(-0.4565F, 0.3804F, -0.3043F, 2.1301F, 1.5215F, 0.6086F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5961F, -1.2913F, -0.4644F, 0.0F, 0.0F, 0.48F));
		PartDefinition DownBody = AllBody.addOrReplaceChild("DownBody", CubeListBuilder.create().texOffs(86, 14).addBox(-4.1154F, -0.0424F, -1.708F, 8.4F, 2.8F, 3.416F, new CubeDeformation(0.0F)).texOffs(50, 85)
				.addBox(-1.3154F, 2.7576F, -1.68F, 2.8F, 1.4F, 3.36F, new CubeDeformation(0.0F)).texOffs(38, 53).addBox(-3.8074F, -0.8824F, -1.19F, 7.784F, 0.84F, 2.38F, new CubeDeformation(0.0F)), PartPose.offset(-0.0846F, 0.0224F, 0.0F));
		PartDefinition DownBody_r1 = DownBody.addOrReplaceChild("DownBody_r1", CubeListBuilder.create().texOffs(78, 85).addBox(-1.12F, -0.7F, -1.68F, 2.52F, 1.4F, 3.36F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition DownBody_r2 = DownBody.addOrReplaceChild("DownBody_r2", CubeListBuilder.create().texOffs(54, 93).addBox(-1.4F, -0.7F, -1.68F, 2.52F, 1.4F, 3.36F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1691F, 2.75F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition Chang_qun = DownBody.addOrReplaceChild("Chang_qun", CubeListBuilder.create(), PartPose.offset(0.0846F, 1.6376F, -0.72F));
		PartDefinition Chang_qun_front = Chang_qun.addOrReplaceChild("Chang_qun_front", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0715F, -0.6148F, -0.3565F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Chang_qun_front_r1 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r1", CubeListBuilder.create().texOffs(58, 112).addBox(-0.3822F, -3.8202F, -0.3554F, 1.1445F, 7.9976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2887F, 3.0056F, -2.3175F, -0.5219F, 0.0436F, 0.0756F));
		PartDefinition Chang_qun_front_r2 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r2", CubeListBuilder.create().texOffs(0, 121).addBox(-0.7622F, -3.8202F, -0.3554F, 1.1445F, 7.9976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4317F, 3.0056F, -2.3175F, -0.5219F, -0.0436F, -0.0756F));
		PartDefinition Chang_qun_front_r3 = Chang_qun_front.addOrReplaceChild("Chang_qun_front_r3", CubeListBuilder.create().texOffs(0, 68).addBox(-2.9321F, -0.1685F, -0.3554F, 5.9017F, 8.0726F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0528F, -0.1486F, -0.4964F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone60 = Chang_qun_front.addOrReplaceChild("bone60", CubeListBuilder.create(), PartPose.offset(3.729F, -0.2205F, -0.4925F));
		PartDefinition bone60_r1 = bone60.addOrReplaceChild("bone60_r1", CubeListBuilder.create().texOffs(50, 196).addBox(-0.2597F, -0.9863F, -0.2861F, 0.5195F, 2.0726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3857F, 0.5884F, 0.6694F, -0.7236F, -1.1934F, 0.4575F));
		PartDefinition bone60_r2 = bone60.addOrReplaceChild("bone60_r2", CubeListBuilder.create().texOffs(46, 199).addBox(-0.4848F, -0.0363F, -0.2861F, 0.4195F, 1.0226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3998F, 0.6266F, 0.6764F, -1.0096F, -1.0251F, 0.7753F));
		PartDefinition bone60_r3 = bone60.addOrReplaceChild("bone60_r3", CubeListBuilder.create().texOffs(20, 188).addBox(-0.5723F, -1.3113F, -0.2861F, 0.7695F, 2.7226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5501F, 0.9514F, 1.3263F, -1.7136F, -1.3501F, 1.4713F));
		PartDefinition bone60_r4 = bone60.addOrReplaceChild("bone60_r4", CubeListBuilder.create().texOffs(16, 146).addBox(-0.5723F, -2.5738F, -0.2861F, 1.1445F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3832F, 4.4953F, -0.5604F, -0.7894F, -1.263F, 0.475F));
		PartDefinition bone60_r5 = bone60.addOrReplaceChild("bone60_r5", CubeListBuilder.create().texOffs(28, 139).addBox(-0.5723F, -3.2488F, -0.2861F, 1.1445F, 6.4976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2309F, 4.3778F, -1.0397F, -1.0734F, -1.1072F, 0.7802F));
		PartDefinition bone60_r6 = bone60.addOrReplaceChild("bone60_r6", CubeListBuilder.create().texOffs(42, 175).addBox(-0.6222F, -0.3613F, -0.2861F, 1.1945F, 2.9726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0424F, 0.2064F, 0.189F, -0.6216F, -0.6224F, 0.2571F));
		PartDefinition bone60_r7 = bone60.addOrReplaceChild("bone60_r7", CubeListBuilder.create().texOffs(32, 153).addBox(-0.5723F, -1.8238F, -0.2861F, 1.1445F, 5.2226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.669F, 4.0457F, -1.7307F, -0.5367F, -0.6942F, 0.1186F));
		PartDefinition bone60_r8 = bone60.addOrReplaceChild("bone60_r8", CubeListBuilder.create().texOffs(32, 160).addBox(-0.4223F, -0.9988F, -0.2861F, 0.9945F, 5.1476F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1765F, 3.3065F, -1.6874F, -0.6461F, -0.5965F, 0.3F));
		PartDefinition bone60_r9 = bone60.addOrReplaceChild("bone60_r9", CubeListBuilder.create().texOffs(20, 146).addBox(-0.5723F, -2.9113F, -0.2861F, 1.1445F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6332F, 5.0016F, 0.3981F, -1.7572F, -1.3501F, 1.4713F));
		PartDefinition bone5 = Chang_qun_front.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.586F, -0.2205F, -0.4925F));
		PartDefinition bone5_r1 = bone5.addOrReplaceChild("bone5_r1", CubeListBuilder.create().texOffs(46, 196).addBox(-0.2598F, -0.9863F, -0.2861F, 0.5195F, 2.0726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3857F, 0.5884F, 0.6694F, -0.7236F, 1.1934F, -0.4575F));
		PartDefinition bone5_r2 = bone5.addOrReplaceChild("bone5_r2", CubeListBuilder.create().texOffs(44, 199).addBox(0.0652F, -0.0363F, -0.2861F, 0.4195F, 1.0226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3998F, 0.6266F, 0.6764F, -1.0096F, 1.0251F, -0.7753F));
		PartDefinition bone5_r3 = bone5.addOrReplaceChild("bone5_r3", CubeListBuilder.create().texOffs(16, 188).addBox(-0.1972F, -1.3113F, -0.2861F, 0.7695F, 2.7226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5501F, 0.9514F, 1.3263F, -1.7136F, 1.3501F, -1.4713F));
		PartDefinition bone5_r4 = bone5.addOrReplaceChild("bone5_r4", CubeListBuilder.create().texOffs(8, 146).addBox(-0.5722F, -2.5738F, -0.2861F, 1.1445F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3832F, 4.4953F, -0.5604F, -0.7894F, 1.263F, -0.475F));
		PartDefinition bone5_r5 = bone5.addOrReplaceChild("bone5_r5", CubeListBuilder.create().texOffs(24, 139).addBox(-0.5722F, -3.2488F, -0.2861F, 1.1445F, 6.4976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2309F, 4.3778F, -1.0397F, -1.0734F, 1.1072F, -0.7802F));
		PartDefinition bone5_r6 = bone5.addOrReplaceChild("bone5_r6", CubeListBuilder.create().texOffs(38, 175).addBox(-0.5722F, -0.3613F, -0.2861F, 1.1945F, 2.9726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0424F, 0.2064F, 0.189F, -0.6216F, 0.6224F, -0.2571F));
		PartDefinition bone5_r7 = bone5.addOrReplaceChild("bone5_r7", CubeListBuilder.create().texOffs(28, 153).addBox(-0.5722F, -1.8238F, -0.2861F, 1.1445F, 5.2226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.669F, 4.0457F, -1.7307F, -0.5367F, 0.6942F, -0.1186F));
		PartDefinition bone5_r8 = bone5.addOrReplaceChild("bone5_r8", CubeListBuilder.create().texOffs(28, 160).addBox(-0.5722F, -0.9988F, -0.2861F, 0.9945F, 5.1476F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1765F, 3.3065F, -1.6874F, -0.6461F, 0.5965F, -0.3F));
		PartDefinition bone5_r9 = bone5.addOrReplaceChild("bone5_r9", CubeListBuilder.create().texOffs(12, 146).addBox(-0.5722F, -2.9113F, -0.2861F, 1.1445F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6332F, 5.0016F, 0.3981F, -1.7572F, 1.3501F, -1.4713F));
		PartDefinition bone35 = Chang_qun_front.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0478F, 6.4077F, -4.6727F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone35_r1 = bone35.addOrReplaceChild("bone35_r1", CubeListBuilder.create().texOffs(64, 192).addBox(-0.5824F, -1.7823F, -0.3476F, 0.5722F, 2.5252F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5202F, 1.8131F, -0.045F, -0.2174F, 0.0189F, 0.0852F));
		PartDefinition bone35_r2 = bone35.addOrReplaceChild("bone35_r2", CubeListBuilder.create().texOffs(68, 192).addBox(-0.2899F, -1.7823F, -0.3476F, 0.5722F, 2.5252F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0727F, 1.8131F, -0.045F, -0.2174F, -0.0189F, -0.0852F));
		PartDefinition bone35_r3 = bone35.addOrReplaceChild("bone35_r3", CubeListBuilder.create().texOffs(16, 77).addBox(-3.7155F, 6.6239F, -0.3476F, 7.4449F, 2.5252F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1193F, -6.3719F, 1.7696F, -0.2182F, 0.0F, 0.0F));
		PartDefinition bone37 = bone35.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offset(7.2811F, 1.2487F, 4.6221F));
		PartDefinition bone37_r1 = bone37.addOrReplaceChild("bone37_r1", CubeListBuilder.create().texOffs(54, 160).addBox(-1.1486F, -2.6876F, -0.2861F, 2.1472F, 2.7502F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6799F, -1.1202F, -1.0433F));
		PartDefinition bone37_r2 = bone37.addOrReplaceChild("bone37_r2", CubeListBuilder.create().texOffs(6, 171).addBox(0.7639F, -2.7626F, -0.2861F, 1.5473F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8086F, 1.0347F, -3.0196F, 0.4267F, -1.1896F, -0.767F));
		PartDefinition bone37_r3 = bone37.addOrReplaceChild("bone37_r3", CubeListBuilder.create().texOffs(46, 179).addBox(-0.5486F, -2.6876F, -0.2861F, 1.0972F, 2.6753F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7669F, 0.9226F, -2.8137F, -0.1482F, -1.2213F, -0.1539F));
		PartDefinition bone37_r4 = bone37.addOrReplaceChild("bone37_r4", CubeListBuilder.create().texOffs(58, 179).addBox(-0.6611F, -2.7626F, -0.2861F, 1.0972F, 2.6002F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1522F, 1.1622F, -3.4511F, -0.0619F, -0.6131F, -0.2577F));
		PartDefinition bone37_r5 = bone37.addOrReplaceChild("bone37_r5", CubeListBuilder.create().texOffs(8, 192).addBox(-0.0986F, -2.2376F, -0.2861F, 0.7598F, 2.3003F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2107F, 1.2053F, -4.2308F, -0.0662F, -0.7002F, -0.2506F));
		PartDefinition bone37_r6 = bone37.addOrReplaceChild("bone37_r6", CubeListBuilder.create().texOffs(66, 175).addBox(-0.5111F, -2.8001F, -0.2861F, 1.1723F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6714F, 1.3532F, -4.6403F, -0.2754F, -0.6552F, 0.0811F));
		PartDefinition bone39 = bone35.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offset(-7.0424F, 1.2487F, 4.6221F));
		PartDefinition bone39_r1 = bone39.addOrReplaceChild("bone39_r1", CubeListBuilder.create().texOffs(48, 160).addBox(-0.9986F, -2.6876F, -0.2861F, 2.1472F, 2.7502F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6799F, 1.1202F, 1.0433F));
		PartDefinition bone39_r2 = bone39.addOrReplaceChild("bone39_r2", CubeListBuilder.create().texOffs(0, 171).addBox(-2.3111F, -2.7626F, -0.2861F, 1.5473F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8086F, 1.0347F, -3.0196F, 0.4267F, 1.1896F, 0.767F));
		PartDefinition bone39_r3 = bone39.addOrReplaceChild("bone39_r3", CubeListBuilder.create().texOffs(42, 179).addBox(-0.5486F, -2.6876F, -0.2861F, 1.0972F, 2.6753F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7669F, 0.9226F, -2.8137F, -0.1482F, 1.2213F, 0.1539F));
		PartDefinition bone39_r4 = bone39.addOrReplaceChild("bone39_r4", CubeListBuilder.create().texOffs(54, 179).addBox(-0.4361F, -2.7626F, -0.2861F, 1.0972F, 2.6002F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1522F, 1.1622F, -3.4511F, -0.0619F, 0.6131F, 0.2577F));
		PartDefinition bone39_r5 = bone39.addOrReplaceChild("bone39_r5", CubeListBuilder.create().texOffs(4, 192).addBox(-0.6611F, -2.2376F, -0.2861F, 0.7598F, 2.3003F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2107F, 1.2053F, -4.2308F, -0.0662F, 0.7002F, 0.2506F));
		PartDefinition bone39_r6 = bone39.addOrReplaceChild("bone39_r6", CubeListBuilder.create().texOffs(62, 175).addBox(-0.6611F, -2.8001F, -0.2861F, 1.1723F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6714F, 1.3532F, -4.6403F, -0.2754F, 0.6552F, -0.0811F));
		PartDefinition bone64 = bone35.addOrReplaceChild("bone64", CubeListBuilder.create(), PartPose.offset(-7.1409F, 2.8167F, 5.2811F));
		PartDefinition bone69 = bone35.addOrReplaceChild("bone69", CubeListBuilder.create(), PartPose.offset(7.3796F, 2.8167F, 5.2811F));
		PartDefinition Chang_qun_behind = Chang_qun.addOrReplaceChild("Chang_qun_behind", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0715F, -0.6148F, 1.7565F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Chang_qun_behind_r1 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r1", CubeListBuilder.create().texOffs(26, 112).addBox(-0.5798F, -3.8971F, -0.494F, 1.2945F, 7.9601F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2887F, 3.0056F, 2.4675F, 0.5219F, -0.0436F, 0.0756F));
		PartDefinition Chang_qun_behind_r2 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r2", CubeListBuilder.create().texOffs(36, 153).addBox(0.0353F, -2.3596F, -0.494F, 0.5445F, 6.4226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4317F, 3.0056F, 2.4675F, 0.5219F, 0.0436F, -0.0756F));
		PartDefinition Chang_qun_behind_r3 = Chang_qun_behind.addOrReplaceChild("Chang_qun_behind_r3", CubeListBuilder.create().texOffs(22, 53).addBox(-3.4946F, -0.2459F, -0.494F, 7.2142F, 7.8851F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0715F, -0.1486F, 0.6464F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone53 = Chang_qun_behind.addOrReplaceChild("bone53", CubeListBuilder.create(), PartPose.offset(-3.661F, -0.2205F, 0.4925F));
		PartDefinition bone53_r1 = bone53.addOrReplaceChild("bone53_r1", CubeListBuilder.create().texOffs(38, 196).addBox(-0.2597F, -1.0863F, -0.2861F, 0.5195F, 2.0726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4332F, 0.6611F, -0.627F, 0.7236F, -1.1934F, -0.4575F));
		PartDefinition bone53_r2 = bone53.addOrReplaceChild("bone53_r2", CubeListBuilder.create().texOffs(42, 196).addBox(0.0652F, -1.0863F, -0.2861F, 0.5195F, 2.0726F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4472F, 0.6993F, -0.634F, 1.0096F, -1.0251F, -0.7753F));
		PartDefinition bone53_r3 = bone53.addOrReplaceChild("bone53_r3", CubeListBuilder.create().texOffs(40, 184).addBox(-0.3472F, -1.3113F, -0.2861F, 0.9195F, 2.7226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4808F, 0.9293F, -1.3328F, 1.7136F, -1.3501F, -1.4713F));
		PartDefinition bone53_r4 = bone53.addOrReplaceChild("bone53_r4", CubeListBuilder.create().texOffs(4, 146).addBox(-0.5723F, -2.5738F, -0.2861F, 1.1445F, 5.8226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3832F, 4.4953F, 0.5604F, 0.7894F, -1.263F, -0.475F));
		PartDefinition bone53_r5 = bone53.addOrReplaceChild("bone53_r5", CubeListBuilder.create().texOffs(20, 139).addBox(-0.5722F, -3.2488F, -0.2861F, 1.1445F, 6.4976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2309F, 4.3778F, 1.0397F, 1.0734F, -1.1072F, -0.7802F));
		PartDefinition bone53_r6 = bone53.addOrReplaceChild("bone53_r6", CubeListBuilder.create().texOffs(82, 196).addBox(-0.5723F, -3.0238F, -0.2861F, 0.3945F, 2.1476F, 0.5722F, new CubeDeformation(0.0F)).texOffs(4, 166).addBox(-0.5723F, -0.9238F,
				-0.2861F, 1.1445F, 4.3226F, 0.5722F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6689F, 4.0457F, 1.7307F, 0.5367F, -0.6942F, -0.1186F));
		PartDefinition bone53_r7 = bone53.addOrReplaceChild("bone53_r7", CubeListBuilder.create().texOffs(46, 130).addBox(-0.9473F, -2.9113F, -0.2861F, 1.5195F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6332F, 5.0016F, -0.3981F, 1.7572F, -1.3501F, -1.4713F));
		PartDefinition bone53_r8 = bone53.addOrReplaceChild("bone53_r8", CubeListBuilder.create().texOffs(20, 130).addBox(-0.5722F, -3.5488F, -0.2861F, 0.7695F, 7.6976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1765F, 3.3065F, 1.6874F, 0.6461F, -0.5965F, -0.3F));
		PartDefinition bone65 = Chang_qun_behind.addOrReplaceChild("bone65", CubeListBuilder.create(), PartPose.offset(3.804F, -0.2205F, 0.4925F));
		PartDefinition bone65_r1 = bone65.addOrReplaceChild("bone65_r1", CubeListBuilder.create().texOffs(72, 196).addBox(-0.2598F, -0.9863F, -0.2861F, 0.5195F, 1.9726F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4332F, 0.6611F, -0.627F, 0.7236F, 1.1934F, 0.4575F));
		PartDefinition bone65_r2 = bone65.addOrReplaceChild("bone65_r2", CubeListBuilder.create().texOffs(76, 196).addBox(-0.5847F, -0.9863F, -0.2861F, 0.5195F, 1.9726F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4472F, 0.6993F, -0.634F, 1.0096F, 1.0251F, 0.7753F));
		PartDefinition bone65_r3 = bone65.addOrReplaceChild("bone65_r3", CubeListBuilder.create().texOffs(36, 184).addBox(-0.5723F, -1.3113F, -0.2861F, 0.9195F, 2.7226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4808F, 0.9293F, -1.3328F, 1.7136F, 1.3501F, 1.4713F));
		PartDefinition bone65_r4 = bone65.addOrReplaceChild("bone65_r4", CubeListBuilder.create().texOffs(0, 146).addBox(-0.5722F, -2.5738F, -0.2861F, 1.1445F, 5.8226F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3832F, 4.4953F, 0.5604F, 0.7894F, 1.263F, 0.475F));
		PartDefinition bone65_r5 = bone65.addOrReplaceChild("bone65_r5", CubeListBuilder.create().texOffs(16, 139).addBox(-0.5723F, -3.2488F, -0.2861F, 1.1445F, 6.4976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2309F, 4.3778F, 1.0397F, 1.0734F, 1.1072F, 0.7802F));
		PartDefinition bone65_r6 = bone65.addOrReplaceChild("bone65_r6", CubeListBuilder.create().texOffs(80, 196).addBox(0.1778F, -3.0238F, -0.2861F, 0.3945F, 2.1476F, 0.5722F, new CubeDeformation(0.0F)).texOffs(0, 166).addBox(-0.5722F, -0.9238F,
				-0.2861F, 1.1445F, 4.3226F, 0.5722F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6689F, 4.0457F, 1.7307F, 0.5367F, 0.6942F, 0.1186F));
		PartDefinition bone65_r7 = bone65.addOrReplaceChild("bone65_r7", CubeListBuilder.create().texOffs(40, 130).addBox(-0.5722F, -2.9113F, -0.2861F, 1.5195F, 5.8226F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6332F, 5.0016F, -0.3981F, 1.7572F, 1.3501F, 1.4713F));
		PartDefinition bone65_r8 = bone65.addOrReplaceChild("bone65_r8", CubeListBuilder.create().texOffs(16, 130).addBox(-0.1972F, -3.5488F, -0.2861F, 0.7695F, 7.6976F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1765F, 3.3065F, 1.6874F, 0.6461F, 0.5965F, 0.3F));
		PartDefinition bone38 = Chang_qun_behind.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0478F, 6.4077F, 4.6727F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone38_r1 = bone38.addOrReplaceChild("bone38_r1", CubeListBuilder.create().texOffs(56, 192).addBox(-0.2974F, -1.9537F, -0.4704F, 0.5722F, 2.5252F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9289F, 1.8228F, 0.1972F, 0.2174F, -0.0189F, 0.0852F));
		PartDefinition bone38_r2 = bone38.addOrReplaceChild("bone38_r2", CubeListBuilder.create().texOffs(60, 192).addBox(-0.2749F, -1.9537F, -0.4704F, 0.5722F, 2.5252F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2852F, 1.8524F, 0.2037F, 0.2174F, 0.0189F, -0.0852F));
		PartDefinition bone38_r3 = bone38.addOrReplaceChild("bone38_r3", CubeListBuilder.create().texOffs(16, 70).addBox(-4.053F, 6.4518F, -0.4704F, 8.3449F, 2.5252F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1193F, -6.4525F, -1.6399F, 0.2182F, 0.0F, 0.0F));
		PartDefinition bone62 = bone38.addOrReplaceChild("bone62", CubeListBuilder.create(), PartPose.offset(7.6566F, 0.6546F, -5.9228F));
		PartDefinition bone62_r1 = bone62.addOrReplaceChild("bone62_r1", CubeListBuilder.create().texOffs(64, 184).addBox(-0.7736F, -2.6876F, -0.5111F, 0.7973F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1873F, 1.1824F, -1.6067F));
		PartDefinition bone62_r2 = bone62.addOrReplaceChild("bone62_r2", CubeListBuilder.create().texOffs(42, 160).addBox(-1.1486F, -2.6876F, -0.2861F, 2.1472F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3005F, 0.5942F, 1.3007F, -0.6799F, 1.1202F, -1.0433F));
		PartDefinition bone62_r3 = bone62.addOrReplaceChild("bone62_r3", CubeListBuilder.create().texOffs(52, 153).addBox(0.2014F, -2.7626F, -0.2861F, 2.2973F, 2.7502F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1091F, 1.6289F, 4.3203F, -0.4267F, 1.1896F, -0.767F));
		PartDefinition bone62_r4 = bone62.addOrReplaceChild("bone62_r4", CubeListBuilder.create().texOffs(16, 192).addBox(-0.5486F, -2.6876F, -0.2861F, 0.5723F, 2.6753F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0674F, 1.5168F, 4.1144F, 0.1482F, 1.2213F, -0.1539F));
		PartDefinition bone62_r5 = bone62.addOrReplaceChild("bone62_r5", CubeListBuilder.create().texOffs(66, 179).addBox(-0.6611F, -2.7626F, -0.2861F, 1.0972F, 2.6002F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4527F, 1.7564F, 4.7518F, 0.0619F, 0.6131F, -0.2577F));
		PartDefinition bone62_r6 = bone62.addOrReplaceChild("bone62_r6", CubeListBuilder.create().texOffs(76, 192).addBox(0.0139F, -2.2376F, -0.2861F, 0.6472F, 2.3003F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5112F, 1.7995F, 5.5315F, 0.0662F, 0.7002F, -0.2506F));
		PartDefinition bone62_r7 = bone62.addOrReplaceChild("bone62_r7", CubeListBuilder.create().texOffs(6, 184).addBox(-0.2861F, -2.8001F, -0.2861F, 0.9473F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.972F, 1.9474F, 5.941F, 0.2754F, 0.6552F, 0.0811F));
		PartDefinition bone52 = bone38.addOrReplaceChild("bone52", CubeListBuilder.create(), PartPose.offset(-7.4179F, 0.6546F, -5.9228F));
		PartDefinition bone52_r1 = bone52.addOrReplaceChild("bone52_r1", CubeListBuilder.create().texOffs(60, 184).addBox(-0.0236F, -2.6876F, -0.5111F, 0.7973F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1873F, -1.1824F, 1.6067F));
		PartDefinition bone52_r2 = bone52.addOrReplaceChild("bone52_r2", CubeListBuilder.create().texOffs(36, 160).addBox(-0.9986F, -2.6876F, -0.2861F, 2.1472F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3005F, 0.5942F, 1.3007F, -0.6799F, -1.1202F, 1.0433F));
		PartDefinition bone52_r3 = bone52.addOrReplaceChild("bone52_r3", CubeListBuilder.create().texOffs(46, 153).addBox(-2.4986F, -2.7626F, -0.2861F, 2.2973F, 2.7502F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1091F, 1.6289F, 4.3203F, -0.4267F, -1.1896F, 0.767F));
		PartDefinition bone52_r4 = bone52.addOrReplaceChild("bone52_r4", CubeListBuilder.create().texOffs(12, 192).addBox(-0.0236F, -2.6876F, -0.2861F, 0.5723F, 2.6753F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0674F, 1.5168F, 4.1144F, 0.1482F, -1.2213F, 0.1539F));
		PartDefinition bone52_r5 = bone52.addOrReplaceChild("bone52_r5", CubeListBuilder.create().texOffs(62, 179).addBox(-0.4361F, -2.7626F, -0.2861F, 1.0972F, 2.6002F, 0.5722F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4527F, 1.7564F, 4.7518F, 0.0619F, -0.6131F, 0.2577F));
		PartDefinition bone52_r6 = bone52.addOrReplaceChild("bone52_r6", CubeListBuilder.create().texOffs(72, 192).addBox(-0.6611F, -2.2376F, -0.2861F, 0.6472F, 2.3003F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5112F, 1.7995F, 5.5315F, 0.0662F, -0.7002F, 0.2506F));
		PartDefinition bone52_r7 = bone52.addOrReplaceChild("bone52_r7", CubeListBuilder.create().texOffs(36, 179).addBox(-0.6611F, -2.8001F, -0.2861F, 1.0972F, 2.7502F, 0.5723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.972F, 1.9474F, 5.941F, 0.2754F, -0.6552F, -0.0811F));
		PartDefinition bone76 = bone38.addOrReplaceChild("bone76", CubeListBuilder.create(), PartPose.offset(7.3796F, 2.4519F, -5.9002F));
		PartDefinition bone63 = bone38.addOrReplaceChild("bone63", CubeListBuilder.create(), PartPose.offset(-7.1409F, 2.4519F, -5.9002F));
		PartDefinition bone71 = Chang_qun_behind.addOrReplaceChild("bone71", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0715F, -0.3352F, 1.4935F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone66 = bone71.addOrReplaceChild("bone66", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7022F, 0.2313F, 0.303F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bone68 = bone71.addOrReplaceChild("bone68", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7022F, 0.2313F, 0.303F, -0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		AllHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.AllHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.AllHead.xRot = headPitch / (180F / (float) Math.PI);
	}
}
