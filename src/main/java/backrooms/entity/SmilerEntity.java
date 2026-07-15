package backrooms.entity;

import backrooms.registry.BackroomsSounds;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvent;

/**
 * The Smiler: lurks at the edge of darkness.
 * Only visible when light level is <= 4.
 * Fast, deadly, instakill on contact.
 */
public class SmilerEntity extends Monster {

    private int lurk = 0;

    public SmilerEntity(EntityType<? extends SmilerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 15;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.6, true));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 8.0f));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 40.0)
            .add(Attributes.ATTACK_DAMAGE, 8.0)
            .add(Attributes.MOVEMENT_SPEED, 0.38)
            .add(Attributes.FOLLOW_RANGE, 24.0)
            .add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
    }

    @Override
    public void tick() {
        super.tick();
        // Smiler becomes invisible in light, revealed only in darkness
        if (!this.level().isClientSide) {
            int light = this.level().getMaxLocalRawBrightness(this.blockPosition());
            this.setInvisible(light > 4);
        }
    }

    @Override
    protected SoundEvent getAmbientSound() { return BackroomsSounds.ENTITY_SMILER_IDLE; }
    @Override
    protected SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource src) { return BackroomsSounds.ENTITY_SMILER_HURT; }
    @Override
    protected SoundEvent getDeathSound() { return BackroomsSounds.ENTITY_SMILER_DEATH; }
}
